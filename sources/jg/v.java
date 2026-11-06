package jg;

import android.graphics.RectF;
import bi.ub;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.c20;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Components.po0;
import org.telegram.ui.Components.u20;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.au0;
import org.telegram.ui.c9;
public final class v implements RequestDelegate {
    public final int f16948a;
    public final int f16949b;
    public final Object f16950c;
    public final Object d;

    public v(int i7, HashSet hashSet, f2 f2Var) {
        this.f16948a = 4;
        this.f16949b = i7;
        this.d = hashSet;
        this.f16950c = f2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i7 = this.f16948a;
        int i10 = this.f16949b;
        Object obj = this.f16950c;
        Object obj2 = this.d;
        switch (i7) {
            case 0:
                h0 h0Var = (h0) obj2;
                h0Var.getClass();
                org.telegram.messenger.g0.h3(new ai.a1((Object) h0Var, this.f16949b, (Object) tLObject, (String) obj, 8));
                return;
            case 1:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$34(i10, (String) obj, tLObject, tL_error);
                return;
            case 2:
                ((VoIPService) obj2).lambda$editCallMember$90(i10, (Runnable) obj, tLObject, tL_error);
                return;
            case 3:
                org.telegram.messenger.g0.h3(new ai.a1((c9) obj2, tLObject, this.f16949b, (TLRPC.User) obj, 15));
                return;
            case 4:
                org.telegram.messenger.g0.h3(new ub(tLObject, this.f16949b, (HashSet) obj2, tL_error, (f2) obj));
                return;
            case 5:
                org.telegram.messenger.g0.h3(new ai.a1((f2) obj2, tLObject, this.f16949b, (c20) obj, 23));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new ai.a1((Object) ((u20) obj2), this.f16949b, (Object) tLObject, (String) obj, 25));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new ai.a1((Object) ((po0) obj2), this.f16949b, (Object) tLObject, (String) obj, 27));
                return;
            case 8:
                RectF rectF = ProfileActivity.S6;
                org.telegram.messenger.g0.i3(new au0((ProfileActivity) obj2, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) obj, 0), i10);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                c20 c20Var = (c20) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i11 = 0; i11 < vector.objects.size(); i11++) {
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) vector.objects.get(i11);
                        arrayList.add(tL_premiumGiftCodeOption);
                        String str = tL_premiumGiftCodeOption.store_product;
                        if (str != null) {
                            ?? obj3 = new Object();
                            obj3.f11113b = "inapp";
                            obj3.f11112a = str;
                            arrayList2.add(obj3.a());
                        }
                    }
                    boolean isEmpty = arrayList2.isEmpty();
                    int i12 = this.f16949b;
                    if (!isEmpty && wg.s.h()) {
                        org.telegram.messenger.r1.i().o(arrayList2, new bg.f0(arrayList, chat, i12, c20Var, 10));
                        return;
                    } else {
                        org.telegram.messenger.g0.h3(new wg.m(chat, i12, arrayList, c20Var, 1));
                        return;
                    }
                }
                return;
        }
    }

    public v(Object obj, int i7, Object obj2, int i10) {
        this.f16948a = i10;
        this.d = obj;
        this.f16949b = i7;
        this.f16950c = obj2;
    }

    public v(ProfileActivity profileActivity, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i7) {
        this.f16948a = 8;
        this.d = profileActivity;
        this.f16950c = tL_channels_getParticipants;
        this.f16949b = i7;
    }
}
