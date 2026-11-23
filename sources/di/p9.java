package di;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.mp;
import org.telegram.messenger.w10;
import org.telegram.messenger.y00;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.i50;
public final class p9 implements w10 {
    public final int f9519a;
    public final int f9520b;
    public final Object f9521c;
    public final Object d;
    public final Object f9522e;

    public p9(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f9519a = i10;
        this.f9521c = obj;
        this.f9520b = i7;
        this.d = obj2;
        this.f9522e = obj3;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f9519a;
        boolean z10 = false;
        int i10 = this.f9520b;
        Object obj2 = this.f9522e;
        Object obj3 = this.d;
        Object obj4 = this.f9521c;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.mc mcVar = (org.telegram.ui.Components.mc) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(mcVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.ui.Components.nc.b(gd.N0(2131744978, null), new ai.x0(this.f9520b, context, i6Var, savedStarGift, 4), i6Var, null));
                    mcVar.setText(spannableStringBuilder);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) obj3;
                bi.z4 z4Var = (bi.z4) obj2;
                ((ai.s1) obj4).a(Boolean.FALSE);
                if (!((Boolean) obj).booleanValue()) {
                    org.telegram.ui.Components.fc Q = org.telegram.ui.Components.kc.Y().Q(2131624012, 36, gd.N0(2131749333, null));
                    Q.f35091j = 5000;
                    Q.j();
                    return;
                } else if (LaunchActivity.T() == g2Var && i10.f24637t0 == i10) {
                    z4Var.run();
                    return;
                } else {
                    org.telegram.ui.Components.fc Q2 = org.telegram.ui.Components.kc.Y().Q(2131623990, 36, gd.N0(2131749334, null));
                    Q2.f35091j = 5000;
                    Q2.j();
                    return;
                }
            case 2:
                DictationAsr.c0((String) obj4, ((String[]) obj3)[((Integer) obj).intValue()]);
                ((w10) obj2).a(Integer.valueOf(i10));
                return;
            case 3:
                org.telegram.ui.ActionBar.g2 g2Var2 = (org.telegram.ui.ActionBar.g2) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                long j3 = ((TLRPC.Chat) obj2).f28492id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean T = org.telegram.messenger.v3.T(chat);
                int i11 = this.f9520b;
                if (!T) {
                    org.telegram.ui.ActionBar.t1 t1Var = new org.telegram.ui.ActionBar.t1(3, g2Var2.getContext(), null);
                    t1Var.r(250L);
                    mp.u1(i11).T(g2Var2.getParentActivity(), chat.f28492id, g2Var2, new li.e0(t1Var, g2Var2, i11, j3, booleanValue), null);
                    return;
                }
                long j10 = chat.f28492id;
                mp.u1(i11).W2(-j10, j3, false, booleanValue, new bi.n(g2Var2, j10, 1));
                return;
            case 4:
                oi.a6 a6Var = (oi.a6) obj4;
                oi.a aVar = (oi.a) obj3;
                String str = (String) obj2;
                SpannableString spannableString = (SpannableString) obj;
                if (i10 == a6Var.J && a6Var.f22044y == aVar) {
                    Editable text = a6Var.f22038f.getText();
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
                        a6Var.I = str;
                        return;
                    }
                    return;
                }
                return;
            case 5:
                bv bvVar = (bv) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                org.telegram.ui.ActionBar.g2 g2Var3 = bvVar.n1;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == i10 && iArr[1] > 0) {
                    bvVar.dismiss();
                    org.telegram.ui.Components.fc.g(g2Var3, new ov0(g2Var3.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, g2Var3.getResourceProvider()), 1500).j();
                    return;
                }
                return;
            case 6:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                i50 i50Var = (i50) obj3;
                Long l10 = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                String str2 = LaunchActivity.C1;
                try {
                    i50Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                LaunchActivity.Q();
                if (tL_storyAlbum == null) {
                    org.telegram.ui.Components.kc Y = org.telegram.ui.Components.kc.Y();
                    if (Y != null) {
                        org.telegram.messenger.f3.n(null, 2131744489, Y, 2131624237, 36);
                        return;
                    }
                    return;
                }
                Bundle bundle = new Bundle();
                if (l10.longValue() > 0) {
                    bundle.putLong("user_id", l10.longValue());
                    if (l10.longValue() == i10.i(launchActivity.P).e()) {
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
                y00 y00Var = (y00) obj3;
                fj fjVar = (fj) obj2;
                String str3 = (String) obj;
                if (i10 == photoViewer.Q4) {
                    photoViewer.f43414o5 = str3;
                    if (y00Var.s() && y00Var.b(fjVar, photoViewer.f43414o5)) {
                        if (photoViewer.f43406n5) {
                            photoViewer.f43418p0.T(20);
                            photoViewer.f43418p0.u(19);
                            return;
                        }
                        photoViewer.f43418p0.T(19);
                        photoViewer.f43418p0.u(20);
                        return;
                    }
                    photoViewer.f43418p0.u(19);
                    photoViewer.f43418p0.u(20);
                    return;
                }
                return;
        }
    }

    public p9(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f9519a = i10;
        this.f9521c = obj;
        this.d = obj2;
        this.f9520b = i7;
        this.f9522e = obj3;
    }

    public p9(Object obj, Object obj2, Object obj3, int i7, int i10) {
        this.f9519a = i10;
        this.f9521c = obj;
        this.d = obj2;
        this.f9522e = obj3;
        this.f9520b = i7;
    }
}
