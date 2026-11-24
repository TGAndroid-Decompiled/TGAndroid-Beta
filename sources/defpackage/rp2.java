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
public final class rp2 implements qac {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public rp2(az3 az3Var, int[] iArr, int i, ArrayList arrayList) {
        this.a = (byte) 1;
        this.c = az3Var;
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
                boolean T = sd2.T(chat);
                int i2 = this.b;
                if (!T) {
                    he heVar = new he(3, null, dVar.getContext());
                    heVar.q(250L);
                    oc7.r1(i2).P(dVar.getParentActivity(), chat.id, dVar, new sp2(heVar, dVar, i2, j, booleanValue), null);
                    return;
                }
                long j2 = chat.id;
                oc7.r1(i2).V2(-j2, j, false, booleanValue, new jz(dVar, j2, (byte) 1));
                return;
            case 1:
                az3 az3Var = (az3) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                d dVar2 = az3Var.m1;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == i && iArr[1] > 0) {
                    az3Var.dismiss();
                    u31.g(dVar2, new o1b(dVar2.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, dVar2.getResourceProvider()), 1500).j();
                    return;
                }
                return;
            case 2:
                d dVar3 = (d) obj4;
                u06 u06Var = (u06) obj2;
                ((ts9) obj3).a(Boolean.FALSE);
                if (!((Boolean) obj).booleanValue()) {
                    u31 Q = c41.Y().Q(2131624012, 36, jb6.M0(2131749283, null));
                    Q.j = 5000;
                    Q.j();
                    return;
                } else if (LaunchActivity.S() == dVar3 && z8c.t0 == i) {
                    u06Var.run();
                    return;
                } else {
                    u31 Q2 = c41.Y().Q(2131623990, 36, jb6.M0(2131749284, null));
                    Q2.j = 5000;
                    Q2.j();
                    return;
                }
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                k16 k16Var = (k16) obj3;
                Long l = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                String str = LaunchActivity.C1;
                try {
                    k16Var.run();
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                LaunchActivity.Q();
                if (tL_storyAlbum == null) {
                    c41 Y = c41.Y();
                    if (Y != null) {
                        ts2.u(null, 2131744419, Y, 2131624231, 36);
                        return;
                    }
                    return;
                }
                Bundle bundle = new Bundle();
                if (l.longValue() > 0) {
                    bundle.putLong("user_id", l.longValue());
                    if (l.longValue() == z8c.h(launchActivity.P).e()) {
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
                b3c b3cVar = (b3c) obj3;
                k47 k47Var = (k47) obj2;
                String str2 = (String) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                if (i == photoViewer.P4) {
                    photoViewer.n5 = str2;
                    if (b3cVar.r() && b3cVar.a(k47Var, photoViewer.n5)) {
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
                xk9 xk9Var = (xk9) obj4;
                ll0 ll0Var = (ll0) obj3;
                String str3 = (String) obj2;
                SpannableString spannableString = (SpannableString) obj;
                if (i == xk9Var.J && xk9Var.y == ll0Var) {
                    Editable text = xk9Var.f.getText();
                    if (TextUtils.equals(str3, text)) {
                        for (xk2 xk2Var : (xk2[]) text.getSpans(0, text.length(), xk2.class)) {
                            text.removeSpan(xk2Var);
                        }
                        xk2[] xk2VarArr = (xk2[]) spannableString.getSpans(0, spannableString.length(), xk2.class);
                        int length = text.length();
                        for (int i3 = 0; i3 < xk2VarArr.length; i3++) {
                            int spanStart = spannableString.getSpanStart(xk2VarArr[i3]);
                            int spanEnd = spannableString.getSpanEnd(xk2VarArr[i3]);
                            if (spanStart >= 0 && spanEnd <= length && spanStart < spanEnd) {
                                text.setSpan(xk2VarArr[i3], spanStart, spanEnd, 33);
                            }
                        }
                        xk9Var.I = str3;
                        return;
                    }
                    return;
                }
                return;
            case 6:
                x51 x51Var = (x51) obj4;
                Context context = (Context) obj3;
                ylb ylbVar = (ylb) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(x51Var.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) y51.b(jb6.M0(2131744908, null), new tda(this.b, context, ylbVar, savedStarGift, (byte) 3), ylbVar, null));
                    x51Var.setText(spannableStringBuilder);
                    return;
                }
                return;
            default:
                DictationAsr.b0((String) obj4, ((String[]) obj3)[((Integer) obj).intValue()]);
                ((qac) obj2).a(Integer.valueOf(i));
                return;
        }
    }

    public rp2(ts9 ts9Var, d dVar, int i, u06 u06Var) {
        this.a = (byte) 2;
        this.d = ts9Var;
        this.c = dVar;
        this.b = i;
        this.e = u06Var;
    }

    public rp2(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    public rp2(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }
}
