package mg;

import ag.g3;
import android.graphics.RectF;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.q20;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.c11;
import org.telegram.ui.Components.m30;
import org.telegram.ui.Components.sp0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.d9;
import org.telegram.ui.kv0;
public final class w implements RequestDelegate {
    public final int f13262a;
    public final int f13263b;
    public final Object f13264c;
    public final Object d;

    public w(int i10, HashSet hashSet, k2 k2Var) {
        this.f13262a = 4;
        this.f13263b = i10;
        this.f13264c = hashSet;
        this.d = k2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f13262a;
        int i11 = this.f13263b;
        Object obj = this.d;
        Object obj2 = this.f13264c;
        switch (i10) {
            case 0:
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                q20 q20Var = (q20) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i12 = 0; i12 < vector.objects.size(); i12++) {
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) vector.objects.get(i12);
                        arrayList.add(tL_premiumGiftCodeOption);
                        String str = tL_premiumGiftCodeOption.store_product;
                        if (str != null) {
                            c5.a aVar = new c5.a();
                            aVar.f3732c = "inapp";
                            aVar.f3731b = str;
                            arrayList2.add(aVar.a());
                        }
                    }
                    boolean isEmpty = arrayList2.isEmpty();
                    int i13 = this.f13263b;
                    if (!isEmpty && k0.h()) {
                        org.telegram.messenger.u1.i().o(arrayList2, new i0(arrayList, chat, i13, q20Var, 0));
                        return;
                    } else {
                        org.telegram.messenger.i0.g3(new a0(chat, i13, arrayList, q20Var, 1));
                        return;
                    }
                }
                return;
            case 1:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$34(i11, (String) obj, tLObject, tL_error);
                return;
            case 2:
                ((VoIPService) obj2).lambda$editCallMember$90(i11, (Runnable) obj, tLObject, tL_error);
                return;
            case 3:
                org.telegram.messenger.i0.g3(new g3((d9) obj2, tLObject, this.f13263b, (TLRPC.User) obj, 10));
                return;
            case 4:
                org.telegram.messenger.i0.g3(new i2.g1(tLObject, this.f13263b, (HashSet) obj2, tL_error, (k2) obj, 5));
                return;
            case 5:
                org.telegram.messenger.i0.g3(new g3((k2) obj2, tLObject, this.f13263b, (q20) obj, 18));
                return;
            case 6:
                org.telegram.messenger.i0.g3(new g3((m30) obj2, this.f13263b, tLObject, (String) obj, 20));
                return;
            case 7:
                org.telegram.messenger.i0.g3(new g3((sp0) obj2, this.f13263b, tLObject, (String) obj, 22));
                return;
            case 8:
                RectF rectF = ProfileActivity.R6;
                org.telegram.messenger.i0.h3(new kv0((ProfileActivity) obj2, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) obj, 0), i11);
                return;
            default:
                zf.z zVar = (zf.z) obj2;
                zVar.getClass();
                org.telegram.messenger.i0.g3(new c11(zVar, this.f13263b, tLObject, (String) obj, 24));
                return;
        }
    }

    public w(Object obj, int i10, Object obj2, int i11) {
        this.f13262a = i11;
        this.f13264c = obj;
        this.f13263b = i10;
        this.d = obj2;
    }

    public w(ProfileActivity profileActivity, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i10) {
        this.f13262a = 8;
        this.f13264c = profileActivity;
        this.d = tL_channels_getParticipants;
        this.f13263b = i10;
    }
}
