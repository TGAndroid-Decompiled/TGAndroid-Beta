package jg;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Components.to0;
import org.telegram.ui.Components.x20;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c9;
import org.telegram.ui.yt0;
public final class u implements RequestDelegate {
    public final int f17294a;
    public final int f17295b;
    public final Object f17296c;
    public final Object d;

    public u(int i7, HashSet hashSet, e2 e2Var) {
        this.f17294a = 4;
        this.f17295b = i7;
        this.d = hashSet;
        this.f17296c = e2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f17294a;
        int i10 = this.f17295b;
        Object obj = this.f17296c;
        Object obj2 = this.d;
        switch (i7) {
            case 0:
                h0 h0Var = (h0) obj2;
                h0Var.getClass();
                org.telegram.messenger.g0.h3(new ci.p0((Object) h0Var, this.f17295b, (Object) tLObject, (String) obj, 6));
                return;
            case 1:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$34(i10, (String) obj, tLObject, tL_error);
                return;
            case 2:
                ((VoIPService) obj2).lambda$editCallMember$90(i10, (Runnable) obj, tLObject, tL_error);
                return;
            case 3:
                org.telegram.messenger.g0.h3(new ci.p0((c9) obj2, tLObject, this.f17295b, (TLRPC.User) obj, 15));
                return;
            case 4:
                org.telegram.messenger.g0.h3(new ai.f1(tLObject, this.f17295b, (HashSet) obj2, tL_error, (e2) obj, 11));
                return;
            case 5:
                org.telegram.messenger.g0.h3(new ci.p0((e2) obj2, tLObject, this.f17295b, (z10) obj, 23));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new ci.p0((Object) ((x20) obj2), this.f17295b, (Object) tLObject, (String) obj, 25));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new ci.p0((Object) ((to0) obj2), this.f17295b, (Object) tLObject, (String) obj, 27));
                return;
            case 8:
                RectF rectF = ProfileActivity.X6;
                org.telegram.messenger.g0.i3(new yt0((ProfileActivity) obj2, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) obj, 0), i10);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                z10 z10Var = (z10) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i11 = 0; i11 < vector.objects.size(); i11++) {
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) vector.objects.get(i11);
                        arrayList.add(tL_premiumGiftCodeOption);
                        String str = tL_premiumGiftCodeOption.store_product;
                        if (str != null) {
                            f5.a aVar = new f5.a();
                            aVar.f10926c = "inapp";
                            aVar.f10925b = str;
                            arrayList2.add(aVar.a());
                        }
                    }
                    boolean isEmpty = arrayList2.isEmpty();
                    int i12 = this.f17295b;
                    if (!isEmpty && wg.q.h()) {
                        org.telegram.messenger.r1.i().o(arrayList2, new bg.f0(arrayList, chat, i12, z10Var, 10));
                        return;
                    } else {
                        org.telegram.messenger.g0.h3(new wg.m(chat, i12, arrayList, z10Var, 1));
                        return;
                    }
                }
                return;
        }
    }

    public u(Object obj, int i7, Object obj2, int i10) {
        this.f17294a = i10;
        this.d = obj;
        this.f17295b = i7;
        this.f17296c = obj2;
    }

    public u(ProfileActivity profileActivity, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i7) {
        this.f17294a = 8;
        this.d = profileActivity;
        this.f17296c = tL_channels_getParticipants;
        this.f17295b = i7;
    }
}
