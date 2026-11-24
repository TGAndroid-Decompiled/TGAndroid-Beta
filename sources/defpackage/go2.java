package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
public final class go2 implements p8c {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public go2(qx3 qx3Var, int[] iArr, int i, ArrayList arrayList) {
        this.a = (byte) 1;
        this.c = qx3Var;
        this.d = iArr;
        this.b = i;
        this.e = arrayList;
    }

    @Override
    public final void a(Object obj) {
        byte b = this.a;
        boolean z = false;
        int i = this.b;
        Object obj2 = this.e;
        Object obj3 = this.d;
        Object obj4 = this.c;
        switch (b) {
            case 0:
                d dVar = (d) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                long j = ((TLRPC.Chat) obj2).id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean T = hc2.T(chat);
                int i2 = this.b;
                if (!T) {
                    hd hdVar = new hd(3, null, dVar.getContext());
                    hdVar.q(250L);
                    na7.q1(i2).P(dVar.getParentActivity(), chat.id, dVar, new ho2(hdVar, dVar, i2, j, booleanValue), null);
                    return;
                }
                long j2 = chat.id;
                na7.q1(i2).T2(-j2, j, false, booleanValue, new jy(dVar, j2, (byte) 1));
                return;
            case 1:
                qx3 qx3Var = (qx3) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                d dVar2 = qx3Var.m1;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == i && iArr[1] > 0) {
                    qx3Var.dismiss();
                    m21.g(dVar2, new nza(dVar2.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, dVar2.getResourceProvider()), 1500).j();
                    return;
                }
                return;
            case 2:
                d dVar3 = (d) obj4;
                uy5 uy5Var = (uy5) obj2;
                ((nu9) obj3).a(Boolean.FALSE);
                if (!((Boolean) obj).booleanValue()) {
                    m21 Q = u21.Y().Q(2131624012, 36, k96.M0(2131749334, null));
                    Q.j = 5000;
                    Q.j();
                    return;
                } else if (LaunchActivity.S() == dVar3 && y6c.t0 == i) {
                    uy5Var.run();
                    return;
                } else {
                    m21 Q2 = u21.Y().Q(2131623990, 36, k96.M0(2131749335, null));
                    Q2.j = 5000;
                    Q2.j();
                    return;
                }
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                kz5 kz5Var = (kz5) obj3;
                Long l = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                String str = LaunchActivity.C1;
                try {
                    kz5Var.run();
                } catch (Exception e) {
                    fa4.g(e, true);
                }
                LaunchActivity.Q();
                if (tL_storyAlbum == null) {
                    u21 Y = u21.Y();
                    if (Y != null) {
                        ir2.v(null, 2131744493, Y, 2131624231, 36);
                        return;
                    }
                    return;
                }
                Bundle bundle = new Bundle();
                if (l.longValue() > 0) {
                    bundle.putLong("user_id", l.longValue());
                    if (l.longValue() == y6c.h(launchActivity.P).e()) {
                        z = true;
                    }
                    bundle.putBoolean("my_profile", z);
                } else {
                    bundle.putLong("chat_id", -l.longValue());
                }
                bundle.putInt("open_story_album_id", i);
                launchActivity.t0(new ProfileActivity(bundle, null));
                return;
            case 4:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                b1c b1cVar = (b1c) obj3;
                k27 k27Var = (k27) obj2;
                String str2 = (String) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                if (i == photoViewer.P4) {
                    photoViewer.n5 = str2;
                    if (b1cVar.r() && b1cVar.a(k27Var, photoViewer.n5)) {
                        boolean z2 = photoViewer.m5;
                        r7 r7Var = photoViewer.p0;
                        if (z2) {
                            r7Var.S(20);
                            photoViewer.p0.u(19);
                            return;
                        }
                        r7Var.S(19);
                        photoViewer.p0.u(20);
                        return;
                    }
                    photoViewer.p0.u(19);
                    photoViewer.p0.u(20);
                    return;
                }
                return;
            case 5:
                wi9 wi9Var = (wi9) obj4;
                lk0 lk0Var = (lk0) obj3;
                String str3 = (String) obj2;
                SpannableString spannableString = (SpannableString) obj;
                if (i == wi9Var.J && wi9Var.y == lk0Var) {
                    Editable text = wi9Var.f.getText();
                    if (TextUtils.equals(str3, text)) {
                        for (jj2 jj2Var : (jj2[]) text.getSpans(0, text.length(), jj2.class)) {
                            text.removeSpan(jj2Var);
                        }
                        jj2[] jj2VarArr = (jj2[]) spannableString.getSpans(0, spannableString.length(), jj2.class);
                        int length = text.length();
                        for (int i3 = 0; i3 < jj2VarArr.length; i3++) {
                            int spanStart = spannableString.getSpanStart(jj2VarArr[i3]);
                            int spanEnd = spannableString.getSpanEnd(jj2VarArr[i3]);
                            if (spanStart >= 0 && spanEnd <= length && spanStart < spanEnd) {
                                text.setSpan(jj2VarArr[i3], spanStart, spanEnd, 33);
                            }
                        }
                        wi9Var.I = str3;
                        return;
                    }
                    return;
                }
                return;
            case 6:
                q41 q41Var = (q41) obj4;
                Context context = (Context) obj3;
                wjb wjbVar = (wjb) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(q41Var.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) r41.b(k96.M0(2131744982, null), new ica(this.b, context, wjbVar, savedStarGift, (byte) 2), wjbVar, null));
                    q41Var.setText(spannableStringBuilder);
                    return;
                }
                return;
            default:
                DictationAsr.b0((String) obj4, ((String[]) obj3)[((Integer) obj).intValue()]);
                ((p8c) obj2).a(Integer.valueOf(i));
                return;
        }
    }

    public go2(nu9 nu9Var, d dVar, int i, uy5 uy5Var) {
        this.a = (byte) 2;
        this.d = nu9Var;
        this.c = dVar;
        this.b = i;
        this.e = uy5Var;
    }

    public go2(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    public go2(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }
}
