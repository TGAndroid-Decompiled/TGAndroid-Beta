package jg;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.messenger.y10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Components.ep0;
import org.telegram.ui.Components.i30;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cu0;
import org.telegram.ui.d9;
public final class u implements RequestDelegate {
    public final int f17705a;
    public final int f17706b;
    public final Object f17707c;
    public final Object d;

    public u(int i7, HashSet hashSet, g2 g2Var) {
        this.f17705a = 4;
        this.f17706b = i7;
        this.d = hashSet;
        this.f17707c = g2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f17705a;
        int i10 = this.f17706b;
        Object obj = this.f17707c;
        Object obj2 = this.d;
        switch (i7) {
            case 0:
                h0 h0Var = (h0) obj2;
                h0Var.getClass();
                org.telegram.messenger.g0.g3(new ai.b1(h0Var, this.f17706b, tLObject, (String) obj, 8));
                return;
            case 1:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$34(i10, (String) obj, tLObject, tL_error);
                return;
            case 2:
                ((VoIPService) obj2).lambda$editCallMember$90(i10, (Runnable) obj, tLObject, tL_error);
                return;
            case 3:
                org.telegram.messenger.g0.g3(new ai.b1((d9) obj2, tLObject, this.f17706b, (TLRPC.User) obj, 17));
                return;
            case 4:
                org.telegram.messenger.g0.g3(new ai.i1(tLObject, this.f17706b, (HashSet) obj2, tL_error, (g2) obj, 11));
                return;
            case 5:
                org.telegram.messenger.g0.g3(new ai.b1((g2) obj2, tLObject, this.f17706b, (y10) obj, 25));
                return;
            case 6:
                org.telegram.messenger.g0.g3(new ai.b1((i30) obj2, this.f17706b, tLObject, (String) obj, 27));
                return;
            case 7:
                org.telegram.messenger.g0.g3(new ai.b1((ep0) obj2, this.f17706b, tLObject, (String) obj, 29));
                return;
            case 8:
                RectF rectF = ProfileActivity.Z6;
                org.telegram.messenger.g0.h3(new cu0((ProfileActivity) obj2, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) obj, 0), i10);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                y10 y10Var = (y10) obj;
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
                            aVar.f11277c = "inapp";
                            aVar.f11276b = str;
                            arrayList2.add(aVar.a());
                        }
                    }
                    boolean isEmpty = arrayList2.isEmpty();
                    int i12 = this.f17706b;
                    if (!isEmpty && wg.s.h()) {
                        org.telegram.messenger.r1.i().o(arrayList2, new bg.g0(arrayList, chat, i12, y10Var, 10));
                        return;
                    } else {
                        org.telegram.messenger.g0.g3(new wg.m(chat, i12, arrayList, y10Var, 1));
                        return;
                    }
                }
                return;
        }
    }

    public u(Object obj, int i7, Object obj2, int i10) {
        this.f17705a = i10;
        this.d = obj;
        this.f17706b = i7;
        this.f17707c = obj2;
    }

    public u(ProfileActivity profileActivity, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i7) {
        this.f17705a = 8;
        this.d = profileActivity;
        this.f17707c = tL_channels_getParticipants;
        this.f17706b = i7;
    }
}
