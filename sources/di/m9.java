package di;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.c10;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.np;
import org.telegram.messenger.z10;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.ev0;
import org.telegram.ui.Components.wu;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.g50;
public final class m9 implements z10 {
    public final int f9057a;
    public final int f9058b;
    public final Object f9059c;
    public final Object d;
    public final Object f9060e;

    public m9(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f9057a = i10;
        this.f9059c = obj;
        this.f9058b = i7;
        this.d = obj2;
        this.f9060e = obj3;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f9057a;
        boolean z10 = false;
        int i10 = this.f9058b;
        Object obj2 = this.f9060e;
        Object obj3 = this.d;
        Object obj4 = this.f9059c;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.ec ecVar = (org.telegram.ui.Components.ec) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ecVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.ui.Components.fc.b(hd.M0(2131745219, null), new ci.p0(this.f9058b, context, e6Var, savedStarGift, 2), e6Var, null));
                    ecVar.setText(spannableStringBuilder);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                long j3 = ((TLRPC.Chat) obj2).f28051id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean T = org.telegram.messenger.t3.T(chat);
                int i11 = this.f9058b;
                if (!T) {
                    org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, e2Var.getContext(), null);
                    t1Var.r(250L);
                    np.s1(i11).T(e2Var.getParentActivity(), chat.f28051id, e2Var, new li.f0(t1Var, e2Var, i11, j3, booleanValue), null);
                    return;
                }
                long j10 = chat.f28051id;
                np.s1(i11).Q2(-j10, j3, false, booleanValue, new bi.n(e2Var, j10, 1));
                return;
            case 2:
                oi.y5 y5Var = (oi.y5) obj4;
                oi.a aVar = (oi.a) obj3;
                String str = (String) obj2;
                SpannableString spannableString = (SpannableString) obj;
                if (i10 == y5Var.J && y5Var.f22151y == aVar) {
                    Editable text = y5Var.f22145f.getText();
                    if (TextUtils.equals(str, text)) {
                        for (qi.c cVar : (qi.c[]) text.getSpans(0, text.length(), qi.c.class)) {
                            text.removeSpan(cVar);
                        }
                        qi.c[] cVarArr = (qi.c[]) spannableString.getSpans(0, spannableString.length(), qi.c.class);
                        int length = text.length();
                        for (int i12 = 0; i12 < cVarArr.length; i12++) {
                            int spanStart = spannableString.getSpanStart(cVarArr[i12]);
                            int spanEnd = spannableString.getSpanEnd(cVarArr[i12]);
                            if (spanStart >= 0 && spanEnd <= length && spanStart < spanEnd) {
                                text.setSpan(cVarArr[i12], spanStart, spanEnd, 33);
                            }
                        }
                        y5Var.I = str;
                        return;
                    }
                    return;
                }
                return;
            case 3:
                wu wuVar = (wu) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                org.telegram.ui.ActionBar.e2 e2Var2 = wuVar.n1;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == i10 && iArr[1] > 0) {
                    wuVar.dismiss();
                    org.telegram.ui.Components.xb.g(e2Var2, new ev0(e2Var2.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, e2Var2.getResourceProvider()), 1500).j();
                    return;
                }
                return;
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                g50 g50Var = (g50) obj3;
                Long l10 = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                String str2 = LaunchActivity.C1;
                try {
                    g50Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                LaunchActivity.Q();
                if (tL_storyAlbum == null) {
                    org.telegram.ui.Components.cc X = org.telegram.ui.Components.cc.X();
                    if (X != null) {
                        org.telegram.messenger.k5.n(null, 2131744730, X, 2131624237, 36);
                        return;
                    }
                    return;
                }
                Bundle bundle = new Bundle();
                if (l10.longValue() > 0) {
                    bundle.putLong("user_id", l10.longValue());
                    if (l10.longValue() == m10.i(launchActivity.P).e()) {
                        z10 = true;
                    }
                    bundle.putBoolean("my_profile", z10);
                } else {
                    bundle.putLong("chat_id", -l10.longValue());
                }
                bundle.putInt("open_story_album_id", i10);
                launchActivity.t0(new ProfileActivity(bundle, null));
                return;
            default:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                c10 c10Var = (c10) obj3;
                gj gjVar = (gj) obj2;
                String str3 = (String) obj;
                if (i10 == photoViewer.Q4) {
                    photoViewer.f42843o5 = str3;
                    if (c10Var.s() && c10Var.b(gjVar, photoViewer.f42843o5)) {
                        if (photoViewer.f42835n5) {
                            photoViewer.f42847p0.T(20);
                            photoViewer.f42847p0.u(19);
                            return;
                        }
                        photoViewer.f42847p0.T(19);
                        photoViewer.f42847p0.u(20);
                        return;
                    }
                    photoViewer.f42847p0.u(19);
                    photoViewer.f42847p0.u(20);
                    return;
                }
                return;
        }
    }

    public m9(wu wuVar, int[] iArr, int i7, ArrayList arrayList) {
        this.f9057a = 3;
        this.f9059c = wuVar;
        this.d = iArr;
        this.f9058b = i7;
        this.f9060e = arrayList;
    }

    public m9(LaunchActivity launchActivity, g50 g50Var, Long l10, int i7) {
        this.f9057a = 4;
        this.f9059c = launchActivity;
        this.d = g50Var;
        this.f9060e = l10;
        this.f9058b = i7;
    }
}
