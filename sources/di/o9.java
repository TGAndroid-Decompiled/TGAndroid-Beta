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
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.x10;
import org.telegram.messenger.z00;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.mv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.n60;
public final class o9 implements x10 {
    public final int f9476a;
    public final int f9477b;
    public final Object f9478c;
    public final Object d;
    public final Object f9479e;

    public o9(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f9476a = i10;
        this.f9478c = obj;
        this.f9477b = i7;
        this.d = obj2;
        this.f9479e = obj3;
    }

    @Override
    public final void a(Object obj) {
        int i7 = this.f9476a;
        boolean z10 = false;
        int i10 = this.f9477b;
        Object obj2 = this.f9479e;
        Object obj3 = this.d;
        Object obj4 = this.f9478c;
        switch (i7) {
            case 0:
                org.telegram.ui.Components.nc ncVar = (org.telegram.ui.Components.nc) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ncVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) org.telegram.ui.Components.oc.b(gd.M0(2131744984, null), new bi.u4(this.f9477b, context, i6Var, savedStarGift, 3), i6Var, null));
                    ncVar.setText(spannableStringBuilder);
                    return;
                }
                return;
            case 1:
                org.telegram.ui.ActionBar.h2 h2Var = (org.telegram.ui.ActionBar.h2) obj3;
                bi.t4 t4Var = (bi.t4) obj2;
                ((ai.v1) obj4).a(Boolean.FALSE);
                if (!((Boolean) obj).booleanValue()) {
                    org.telegram.ui.Components.gc Q = org.telegram.ui.Components.lc.Y().Q(2131624012, 36, gd.M0(2131749334, null));
                    Q.f35461j = 5000;
                    Q.j();
                    return;
                } else if (LaunchActivity.T() == h2Var && j10.f24773t0 == i10) {
                    t4Var.run();
                    return;
                } else {
                    org.telegram.ui.Components.gc Q2 = org.telegram.ui.Components.lc.Y().Q(2131623990, 36, gd.M0(2131749335, null));
                    Q2.f35461j = 5000;
                    Q2.j();
                    return;
                }
            case 2:
                org.telegram.ui.ActionBar.h2 h2Var2 = (org.telegram.ui.ActionBar.h2) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                long j3 = ((TLRPC.Chat) obj2).f28405id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean T = org.telegram.messenger.v3.T(chat);
                int i11 = this.f9477b;
                if (!T) {
                    org.telegram.ui.ActionBar.u1 u1Var = new org.telegram.ui.ActionBar.u1(3, h2Var2.getContext(), null);
                    u1Var.r(250L);
                    mp.u1(i11).T(h2Var2.getParentActivity(), chat.f28405id, h2Var2, new li.f0(u1Var, h2Var2, i11, j3, booleanValue), null);
                    return;
                }
                long j10 = chat.f28405id;
                mp.u1(i11).W2(-j10, j3, false, booleanValue, new bi.n(h2Var2, j10, 1));
                return;
            case 3:
                oi.z5 z5Var = (oi.z5) obj4;
                oi.a aVar = (oi.a) obj3;
                String str = (String) obj2;
                SpannableString spannableString = (SpannableString) obj;
                if (i10 == z5Var.J && z5Var.f22568y == aVar) {
                    Editable text = z5Var.f22562f.getText();
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
                        z5Var.I = str;
                        return;
                    }
                    return;
                }
                return;
            case 4:
                bv bvVar = (bv) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                org.telegram.ui.ActionBar.h2 h2Var3 = bvVar.n1;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == i10 && iArr[1] > 0) {
                    bvVar.dismiss();
                    org.telegram.ui.Components.gc.g(h2Var3, new mv0(h2Var3.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, h2Var3.getResourceProvider()), 1500).j();
                    return;
                }
                return;
            case 5:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                n60 n60Var = (n60) obj3;
                Long l10 = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                String str2 = LaunchActivity.C1;
                try {
                    n60Var.run();
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                LaunchActivity.Q();
                if (tL_storyAlbum == null) {
                    org.telegram.ui.Components.lc Y = org.telegram.ui.Components.lc.Y();
                    if (Y != null) {
                        org.telegram.messenger.f3.n(null, 2131744495, Y, 2131624237, 36);
                        return;
                    }
                    return;
                }
                Bundle bundle = new Bundle();
                if (l10.longValue() > 0) {
                    bundle.putLong("user_id", l10.longValue());
                    if (l10.longValue() == j10.i(launchActivity.P).e()) {
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
                z00 z00Var = (z00) obj3;
                fj fjVar = (fj) obj2;
                String str3 = (String) obj;
                if (i10 == photoViewer.Q4) {
                    photoViewer.f43288o5 = str3;
                    if (z00Var.s() && z00Var.b(fjVar, photoViewer.f43288o5)) {
                        if (photoViewer.f43280n5) {
                            photoViewer.f43292p0.T(20);
                            photoViewer.f43292p0.u(19);
                            return;
                        }
                        photoViewer.f43292p0.T(19);
                        photoViewer.f43292p0.u(20);
                        return;
                    }
                    photoViewer.f43292p0.u(19);
                    photoViewer.f43292p0.u(20);
                    return;
                }
                return;
        }
    }

    public o9(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f9476a = i10;
        this.f9478c = obj;
        this.d = obj2;
        this.f9477b = i7;
        this.f9479e = obj3;
    }

    public o9(LaunchActivity launchActivity, n60 n60Var, Long l10, int i7) {
        this.f9476a = 5;
        this.f9478c = launchActivity;
        this.d = n60Var;
        this.f9479e = l10;
        this.f9477b = i7;
    }
}
