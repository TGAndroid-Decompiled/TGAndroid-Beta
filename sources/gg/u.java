package gg;

import ai.d9;
import ei.l3;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.rr0;
import org.telegram.ui.Components.v40;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c9;
import org.telegram.ui.ea;
import org.telegram.ui.ly0;
public final class u implements RequestDelegate {
    public final int f10822a;
    public final int f10823b;
    public final Object f10824c;
    public final Object d;

    public u(int i10, HashSet hashSet, n2 n2Var) {
        this.f10822a = 4;
        this.f10823b = i10;
        this.d = hashSet;
        this.f10824c = n2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10822a) {
            case 0:
                h0 h0Var = (h0) this.d;
                h0Var.getClass();
                AndroidUtilities.runOnUIThread(new d9(h0Var, this.f10823b, tLObject, (String) this.f10824c, 4));
                return;
            case 1:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$34(this.f10823b, (String) this.f10824c, tLObject, tL_error);
                return;
            case 2:
                ((VoIPService) this.d).lambda$editCallMember$90(this.f10823b, (Runnable) this.f10824c, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new d9((c9) this.d, tLObject, this.f10823b, (TLRPC.User) this.f10824c, 11));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new l3(tLObject, this.f10823b, (HashSet) this.d, tL_error, (n2) this.f10824c, 15));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new d9((n2) this.d, tLObject, this.f10823b, (Utilities.Callback) this.f10824c, 18));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new d9((v40) this.d, this.f10823b, tLObject, (String) this.f10824c, 20));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new d9((rr0) this.d, this.f10823b, tLObject, (String) this.f10824c, 22));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ly0((ProfileActivity) this.d, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.f10824c, 0), this.f10823b);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.f10824c;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) vector.objects.get(i10);
                        arrayList.add(tL_premiumGiftCodeOption);
                        String str = tL_premiumGiftCodeOption.store_product;
                        if (str != null) {
                            c5.a aVar = new c5.a();
                            aVar.f4199c = "inapp";
                            aVar.f4198b = str;
                            arrayList2.add(aVar.a());
                        }
                    }
                    boolean isEmpty = arrayList2.isEmpty();
                    int i11 = this.f10823b;
                    if (!isEmpty && tg.s.h()) {
                        BillingController.getInstance().queryProductDetails(arrayList2, new ea(arrayList, chat, i11, callback, 9));
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(new tg.n(chat, i11, arrayList, callback, 0));
                        return;
                    }
                }
                return;
        }
    }

    public u(Object obj, int i10, Object obj2, int i11) {
        this.f10822a = i11;
        this.d = obj;
        this.f10823b = i10;
        this.f10824c = obj2;
    }

    public u(ProfileActivity profileActivity, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i10) {
        this.f10822a = 8;
        this.d = profileActivity;
        this.f10824c = tL_channels_getParticipants;
        this.f10823b = i10;
    }
}
