package kg;

import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.u10;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Components.q20;
import org.telegram.ui.Components.ro0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b9;
import org.telegram.ui.rt0;
public final class t implements RequestDelegate {
    public final int f17187a;
    public final int f17188b;
    public final Object f17189c;
    public final Object d;

    public t(int i3, HashSet hashSet, d2 d2Var) {
        this.f17187a = 4;
        this.f17188b = i3;
        this.d = hashSet;
        this.f17189c = d2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i3 = this.f17187a;
        int i10 = this.f17188b;
        Object obj = this.f17189c;
        Object obj2 = this.d;
        switch (i3) {
            case 0:
                e0 e0Var = (e0) obj2;
                e0Var.getClass();
                org.telegram.messenger.g0.h3(new bi.q0((Object) e0Var, this.f17188b, (Object) tLObject, (String) obj, 8));
                return;
            case 1:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$34(i10, (String) obj, tLObject, tL_error);
                return;
            case 2:
                ((VoIPService) obj2).lambda$editCallMember$90(i10, (Runnable) obj, tLObject, tL_error);
                return;
            case 3:
                org.telegram.messenger.g0.h3(new bi.q0((b9) obj2, tLObject, this.f17188b, (TLRPC.User) obj, 16));
                return;
            case 4:
                org.telegram.messenger.g0.h3(new ai.p1(tLObject, this.f17188b, (HashSet) obj2, tL_error, (d2) obj, 11));
                return;
            case 5:
                org.telegram.messenger.g0.h3(new bi.q0((d2) obj2, tLObject, this.f17188b, (u10) obj, 24));
                return;
            case 6:
                org.telegram.messenger.g0.h3(new bi.q0((Object) ((q20) obj2), this.f17188b, (Object) tLObject, (String) obj, 26));
                return;
            case 7:
                org.telegram.messenger.g0.h3(new bi.q0((Object) ((ro0) obj2), this.f17188b, (Object) tLObject, (String) obj, 28));
                return;
            case 8:
                RectF rectF = ProfileActivity.T6;
                org.telegram.messenger.g0.i3(new rt0((ProfileActivity) obj2, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) obj, 0), i10);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                u10 u10Var = (u10) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i11 = 0; i11 < vector.objects.size(); i11++) {
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) vector.objects.get(i11);
                        arrayList.add(tL_premiumGiftCodeOption);
                        String str = tL_premiumGiftCodeOption.store_product;
                        if (str != null) {
                            e5.a aVar = new e5.a();
                            aVar.f9555c = "inapp";
                            aVar.f9554b = str;
                            arrayList2.add(aVar.a());
                        }
                    }
                    boolean isEmpty = arrayList2.isEmpty();
                    int i12 = this.f17188b;
                    if (!isEmpty && xg.s.h()) {
                        org.telegram.messenger.r1.i().o(arrayList2, new cg.e0(arrayList, chat, i12, u10Var, 11));
                        return;
                    } else {
                        org.telegram.messenger.g0.h3(new xg.o(chat, i12, arrayList, u10Var, 1));
                        return;
                    }
                }
                return;
        }
    }

    public t(Object obj, int i3, Object obj2, int i10) {
        this.f17187a = i10;
        this.d = obj;
        this.f17188b = i3;
        this.f17189c = obj2;
    }

    public t(ProfileActivity profileActivity, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i3) {
        this.f17187a = 8;
        this.d = profileActivity;
        this.f17189c = tL_channels_getParticipants;
        this.f17188b = i3;
    }
}
