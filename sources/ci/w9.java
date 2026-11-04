package ci;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.u10;
import org.telegram.messenger.x00;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bv0;
import org.telegram.ui.Components.pu;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ly;
public final class w9 implements u10 {
    public final int f6268a;
    public final int f6269b;
    public final Object f6270c;
    public final Object d;
    public final Object f6271e;

    public w9(Object obj, int i3, Object obj2, Object obj3, int i10) {
        this.f6268a = i10;
        this.f6270c = obj;
        this.f6269b = i3;
        this.d = obj2;
        this.f6271e = obj3;
    }

    @Override
    public final void a(Object obj) {
        int i3 = this.f6268a;
        boolean z10 = false;
        int i10 = this.f6269b;
        Object obj2 = this.f6271e;
        Object obj3 = this.d;
        Object obj4 = this.f6270c;
        switch (i3) {
            case 0:
                org.telegram.ui.Components.hc hcVar = (org.telegram.ui.Components.hc) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(hcVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.ui.Components.ic.b(bd.M0(2131745229, null), new bi.q0(this.f6269b, context, e6Var, savedStarGift, 2), e6Var, null));
                    hcVar.setText(spannableStringBuilder);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                long j10 = ((TLRPC.Chat) obj2).f27001id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean T = org.telegram.messenger.t3.T(chat);
                int i11 = this.f6269b;
                if (!T) {
                    org.telegram.ui.ActionBar.s1 s1Var = new org.telegram.ui.ActionBar.s1(3, d2Var.getContext(), null);
                    s1Var.r(250L);
                    hp.s1(i11).T(d2Var.getParentActivity(), chat.f27001id, d2Var, new ji.d0(s1Var, d2Var, i11, j10, booleanValue), null);
                    return;
                }
                long j11 = chat.f27001id;
                hp.s1(i11).Q2(-j11, j10, false, booleanValue, new ai.r(d2Var, j11, 1));
                return;
            case 2:
                mi.b6 b6Var = (mi.b6) obj4;
                mi.a aVar = (mi.a) obj3;
                String str = (String) obj2;
                SpannableString spannableString = (SpannableString) obj;
                if (i10 == b6Var.J && b6Var.f19491y == aVar) {
                    Editable text = b6Var.f19485f.getText();
                    if (TextUtils.equals(str, text)) {
                        for (oi.d dVar : (oi.d[]) text.getSpans(0, text.length(), oi.d.class)) {
                            text.removeSpan(dVar);
                        }
                        oi.d[] dVarArr = (oi.d[]) spannableString.getSpans(0, spannableString.length(), oi.d.class);
                        int length = text.length();
                        for (int i12 = 0; i12 < dVarArr.length; i12++) {
                            int spanStart = spannableString.getSpanStart(dVarArr[i12]);
                            int spanEnd = spannableString.getSpanEnd(dVarArr[i12]);
                            if (spanStart >= 0 && spanEnd <= length && spanStart < spanEnd) {
                                text.setSpan(dVarArr[i12], spanStart, spanEnd, 33);
                            }
                        }
                        b6Var.I = str;
                        return;
                    }
                    return;
                }
                return;
            case 3:
                pu puVar = (pu) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                org.telegram.ui.ActionBar.d2 d2Var2 = puVar.k1;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == i10 && iArr[1] > 0) {
                    puVar.dismiss();
                    org.telegram.ui.Components.ac.g(d2Var2, new bv0(d2Var2.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, d2Var2.getResourceProvider()), 1500).j();
                    return;
                }
                return;
            case 4:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                ly lyVar = (ly) obj3;
                Long l10 = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                String str2 = LaunchActivity.E1;
                try {
                    lyVar.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                LaunchActivity.Q();
                if (tL_storyAlbum == null) {
                    org.telegram.ui.Components.fc X = org.telegram.ui.Components.fc.X();
                    if (X != null) {
                        org.telegram.messenger.k5.o(null, 2131744740, X, 2131624236, 36);
                        return;
                    }
                    return;
                }
                Bundle bundle = new Bundle();
                if (l10.longValue() > 0) {
                    bundle.putLong("user_id", l10.longValue());
                    if (l10.longValue() == h10.i(launchActivity.P).e()) {
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
                x00 x00Var = (x00) obj3;
                zi ziVar = (zi) obj2;
                String str3 = (String) obj;
                if (i10 == photoViewer.R4) {
                    photoViewer.f41509p5 = str3;
                    if (x00Var.s() && x00Var.b(ziVar, photoViewer.f41509p5)) {
                        if (photoViewer.f41500o5) {
                            photoViewer.f41504p0.S(20);
                            photoViewer.f41504p0.t(19);
                            return;
                        }
                        photoViewer.f41504p0.S(19);
                        photoViewer.f41504p0.t(20);
                        return;
                    }
                    photoViewer.f41504p0.t(19);
                    photoViewer.f41504p0.t(20);
                    return;
                }
                return;
        }
    }

    public w9(pu puVar, int[] iArr, int i3, ArrayList arrayList) {
        this.f6268a = 3;
        this.f6270c = puVar;
        this.d = iArr;
        this.f6269b = i3;
        this.f6271e = arrayList;
    }

    public w9(LaunchActivity launchActivity, ly lyVar, Long l10, int i3) {
        this.f6268a = 4;
        this.f6270c = launchActivity;
        this.d = lyVar;
        this.f6271e = l10;
        this.f6269b = i3;
    }
}
