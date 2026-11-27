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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
public final class zo2 implements pcc {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public zo2(int i, TL_stars.TL_starGiftUnique tL_starGiftUnique, String str, xra xraVar) {
        this.a = (byte) 4;
        this.b = i;
        this.c = tL_starGiftUnique;
        this.d = str;
        this.e = xraVar;
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
                e eVar = (e) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                long j = ((TLRPC.Chat) obj2).id;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                boolean T = xc2.T(chat);
                int i2 = this.b;
                if (!T) {
                    id idVar = new id(3, null, eVar.getContext());
                    idVar.q(250L);
                    uc7.s1(i2).R(eVar.getParentActivity(), chat.id, eVar, new ap2(idVar, eVar, i2, j, booleanValue), null);
                    return;
                }
                long j2 = chat.id;
                uc7.s1(i2).Z2(-j2, j, false, booleanValue, new ky(eVar, j2, (byte) 1));
                return;
            case 1:
                ly3 ly3Var = (ly3) obj4;
                int[] iArr = (int[]) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                e eVar2 = ly3Var.m1;
                iArr[0] = iArr[0] + 1;
                if (((Boolean) obj).booleanValue()) {
                    iArr[1] = iArr[1] + 1;
                }
                if (iArr[0] == i && iArr[1] > 0) {
                    ly3Var.dismiss();
                    v21.g(eVar2, new l3b(eVar2.getFragmentView().getContext(), (TLObject) arrayList.get(0), iArr[1], 2, null, eVar2.getResourceProvider()), 1500).j();
                    return;
                }
                return;
            case 2:
                e eVar3 = (e) obj4;
                v06 v06Var = (v06) obj2;
                ((vra) obj3).a(Boolean.FALSE);
                if (!((Boolean) obj).booleanValue()) {
                    v21 Q = d31.Y().Q(2131624012, 36, ob6.M0(2131749280, null));
                    Q.j = 5000;
                    Q.j();
                    return;
                } else if (LaunchActivity.S() == eVar3 && yac.t0 == i) {
                    v06Var.run();
                    return;
                } else {
                    v21 Q2 = d31.Y().Q(2131623990, 36, ob6.M0(2131749281, null));
                    Q2.j = 5000;
                    Q2.j();
                    return;
                }
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) obj4;
                tg5 tg5Var = (tg5) obj3;
                Long l = (Long) obj2;
                TL_stories.TL_storyAlbum tL_storyAlbum = (TL_stories.TL_storyAlbum) obj;
                String str = LaunchActivity.C1;
                try {
                    tg5Var.run();
                } catch (Exception e) {
                    cc4.g(e, true);
                }
                LaunchActivity.Q();
                if (tL_storyAlbum == null) {
                    d31 Y = d31.Y();
                    if (Y != null) {
                        bs2.v(null, 2131744387, Y, 2131624231, 36);
                        return;
                    }
                    return;
                }
                Bundle bundle = new Bundle();
                if (l.longValue() > 0) {
                    bundle.putLong("user_id", l.longValue());
                    if (l.longValue() == yac.h(launchActivity.P).e()) {
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
                TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj4;
                String str2 = (String) obj3;
                xra xraVar = (xra) obj2;
                if (!((Boolean) obj).booleanValue()) {
                    it7.o(i, tL_starGiftUnique.slug, false);
                    it7.v(tL_starGiftUnique, ob6.a0(null, null, 2131749581, str2));
                    return;
                }
                jxa.v(i, false).O(tL_starGiftUnique.slug);
                xraVar.run();
                it7.v(tL_starGiftUnique, ob6.a0(null, null, 2131749384, str2));
                return;
            case 5:
                PhotoViewer photoViewer = (PhotoViewer) obj4;
                a5c a5cVar = (a5c) obj3;
                r47 r47Var = (r47) obj2;
                String str3 = (String) obj;
                Drawable[] drawableArr = PhotoViewer.d9;
                if (i == photoViewer.P4) {
                    photoViewer.n5 = str3;
                    if (a5cVar.r() && a5cVar.a(r47Var, photoViewer.n5)) {
                        boolean z2 = photoViewer.m5;
                        s7 s7Var = photoViewer.p0;
                        if (z2) {
                            s7Var.S(20);
                            photoViewer.p0.u(19);
                            return;
                        }
                        s7Var.S(19);
                        photoViewer.p0.u(20);
                        return;
                    }
                    photoViewer.p0.u(19);
                    photoViewer.p0.u(20);
                    return;
                }
                return;
            case 6:
                km9 km9Var = (km9) obj4;
                mk0 mk0Var = (mk0) obj3;
                String str4 = (String) obj2;
                SpannableString spannableString = (SpannableString) obj;
                if (i == km9Var.J && km9Var.y == mk0Var) {
                    Editable text = km9Var.f.getText();
                    if (TextUtils.equals(str4, text)) {
                        for (fk2 fk2Var : (fk2[]) text.getSpans(0, text.length(), fk2.class)) {
                            text.removeSpan(fk2Var);
                        }
                        fk2[] fk2VarArr = (fk2[]) spannableString.getSpans(0, spannableString.length(), fk2.class);
                        int length = text.length();
                        for (int i3 = 0; i3 < fk2VarArr.length; i3++) {
                            int spanStart = spannableString.getSpanStart(fk2VarArr[i3]);
                            int spanEnd = spannableString.getSpanEnd(fk2VarArr[i3]);
                            if (spanStart >= 0 && spanEnd <= length && spanStart < spanEnd) {
                                text.setSpan(fk2VarArr[i3], spanStart, spanEnd, 33);
                            }
                        }
                        km9Var.I = str4;
                        return;
                    }
                    return;
                }
                return;
            case 7:
                y41 y41Var = (y41) obj4;
                Context context = (Context) obj3;
                vnb vnbVar = (vnb) obj2;
                TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                if (savedStarGift != null) {
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(y41Var.getText());
                    spannableStringBuilder.append((CharSequence) " ").append((CharSequence) z41.b(ob6.M0(2131744876, null), new efa(this.b, context, vnbVar, savedStarGift, (byte) 4), vnbVar, null));
                    y41Var.setText(spannableStringBuilder);
                    return;
                }
                return;
            default:
                DictationAsr.d0((String) obj4, ((String[]) obj3)[((Integer) obj).intValue()]);
                ((pcc) obj2).a(Integer.valueOf(i));
                return;
        }
    }

    public zo2(ly3 ly3Var, int[] iArr, int i, ArrayList arrayList) {
        this.a = (byte) 1;
        this.c = ly3Var;
        this.d = iArr;
        this.b = i;
        this.e = arrayList;
    }

    public zo2(vra vraVar, e eVar, int i, v06 v06Var) {
        this.a = (byte) 2;
        this.d = vraVar;
        this.c = eVar;
        this.b = i;
        this.e = v06Var;
    }

    public zo2(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    public zo2(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }
}
