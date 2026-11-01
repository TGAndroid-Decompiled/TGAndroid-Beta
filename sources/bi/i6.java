package bi;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.messenger.dd;
import org.telegram.messenger.e20;
import org.telegram.messenger.f8;
import org.telegram.messenger.kj;
import org.telegram.messenger.r20;
import org.telegram.messenger.u10;
import org.telegram.messenger.wp;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cv;
import org.telegram.ui.Components.d11;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.gw0;
import org.telegram.ui.Components.wb;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.rv;
import org.telegram.ui.y60;
import org.telegram.ui.z70;
public final class i6 implements r20 {
    public final int f3102a;
    public final int f3103b;
    public final Object f3104c;
    public final Object d;
    public final Object e;

    public i6(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f3102a = i11;
        this.f3104c = obj;
        this.f3103b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    @Override
    public final void a(Object obj) {
        int i10 = this.f3102a;
        boolean z10 = false;
        int i11 = this.f3103b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.f3104c;
        switch (i10) {
            case 0:
                q6 q6Var = (q6) obj4;
                a aVar = (a) obj3;
                String str = (String) obj2;
                SpannableString spannableString = (SpannableString) obj;
                if (i11 == q6Var.I && q6Var.f3309y == aVar) {
                    Editable text = q6Var.f3303f.getText();
                    if (TextUtils.equals(str, text)) {
                        for (di.e eVar : (di.e[]) text.getSpans(0, text.length(), di.e.class)) {
                            text.removeSpan(eVar);
                        }
                        di.e[] eVarArr = (di.e[]) spannableString.getSpans(0, spannableString.length(), di.e.class);
                        int length = text.length();
                        for (int i12 = 0; i12 < eVarArr.length; i12++) {
                            int spanStart = spannableString.getSpanStart(eVarArr[i12]);
                            int spanEnd = spannableString.getSpanEnd(eVarArr[i12]);
                            if (spanStart >= 0 && spanEnd <= length && spanStart < spanEnd) {
                                text.setSpan(eVarArr[i12], spanStart, spanEnd, 33);
                            }
                        }
                        q6Var.H = str;
                        return;
                    }
                    return;
                }
                return;
            case 1:
                cv cvVar = (cv) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                org.telegram.ui.ActionBar.k2 k2Var = cvVar.f25243j1;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == i11 && iArr[1] > 0) {
                    cvVar.dismiss();
                    wb.g(k2Var, new gw0(k2Var.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, k2Var.getResourceProvider()), 1500).j();
                    return;
                }
                return;
            case 2:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                y60 y60Var = (y60) obj3;
                Long l4 = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                Pattern pattern = LaunchActivity.D1;
                try {
                    y60Var.run();
                } catch (Exception e) {
                    f8.g(e, true);
                }
                LaunchActivity.Q();
                if (tL_storyAlbum == null) {
                    cc X = cc.X();
                    if (X != null) {
                        org.telegram.messenger.m5.n(null, 2131744748, X, 2131624234, 36);
                        return;
                    }
                    return;
                }
                Bundle bundle = new Bundle();
                if (l4.longValue() > 0) {
                    bundle.putLong("user_id", l4.longValue());
                    if (l4.longValue() == e20.i(launchActivity.O).e()) {
                        z10 = true;
                    }
                    bundle.putBoolean("my_profile", z10);
                } else {
                    bundle.putLong("chat_id", -l4.longValue());
                }
                bundle.putInt("open_story_album_id", i11);
                launchActivity.t0(new ProfileActivity(bundle, null));
                return;
            case 3:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                u10 u10Var = (u10) obj3;
                kj kjVar = (kj) obj2;
                String str2 = (String) obj;
                if (i11 == photoViewer.Q4) {
                    photoViewer.f33569o5 = str2;
                    if (u10Var.s() && u10Var.b(kjVar, photoViewer.f33569o5)) {
                        if (photoViewer.f33560n5) {
                            photoViewer.f33564o0.S(20);
                            photoViewer.f33564o0.t(19);
                            return;
                        }
                        photoViewer.f33564o0.S(19);
                        photoViewer.f33564o0.t(20);
                        return;
                    }
                    photoViewer.f33564o0.t(19);
                    photoViewer.f33564o0.t(20);
                    return;
                }
                return;
            case 4:
                ec ecVar = (ec) obj4;
                Context context = (Context) obj3;
                org.telegram.ui.ActionBar.p6 p6Var = (org.telegram.ui.ActionBar.p6) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ecVar.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) fc.b(dd.L0(2131745237, null), new d11(this.f3103b, context, p6Var, savedStarGift, 19), p6Var, null));
                    ecVar.setText(spannableStringBuilder);
                    return;
                }
                return;
            default:
                org.telegram.ui.ActionBar.k2 k2Var2 = (org.telegram.ui.ActionBar.k2) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                long j10 = ((TLRPC.Chat) obj2).f19794id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean T = org.telegram.messenger.w3.T(chat);
                int i13 = this.f3103b;
                if (!T) {
                    org.telegram.ui.ActionBar.x1 x1Var = new org.telegram.ui.ActionBar.x1(3, k2Var2.getContext(), null);
                    x1Var.r(250L);
                    wp.r1(i13).T(k2Var2.getParentActivity(), chat.f19794id, k2Var2, new rv(x1Var, k2Var2, i13, j10, booleanValue), null);
                    return;
                }
                long j11 = chat.f19794id;
                wp.r1(i13).O2(-j11, j10, false, booleanValue, new z70(k2Var2, j11, 2));
                return;
        }
    }

    public i6(cv cvVar, int[] iArr, int i10, ArrayList arrayList) {
        this.f3102a = 1;
        this.f3104c = cvVar;
        this.d = iArr;
        this.f3103b = i10;
        this.e = arrayList;
    }

    public i6(LaunchActivity launchActivity, y60 y60Var, Long l4, int i10) {
        this.f3102a = 2;
        this.f3104c = launchActivity;
        this.d = y60Var;
        this.e = l4;
        this.f3103b = i10;
    }
}
