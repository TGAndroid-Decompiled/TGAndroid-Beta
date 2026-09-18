package gg;

import ai.c9;
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
import org.telegram.ui.ActionBar.o2;
import org.telegram.ui.Components.e40;
import org.telegram.ui.Components.nq0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.f9;
import org.telegram.ui.fa;
import org.telegram.ui.oy0;
public final class u implements RequestDelegate {
    public final int f9944a;
    public final int f9945b;
    public final Object f9946c;
    public final Object d;

    public u(int i10, HashSet hashSet, o2 o2Var) {
        this.f9944a = 4;
        this.f9945b = i10;
        this.d = hashSet;
        this.f9946c = o2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9944a) {
            case 0:
                i0 i0Var = (i0) this.d;
                i0Var.getClass();
                AndroidUtilities.runOnUIThread(new c9(i0Var, this.f9945b, tLObject, (String) this.f9946c, 4));
                return;
            case 1:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$34(this.f9945b, (String) this.f9946c, tLObject, tL_error);
                return;
            case 2:
                ((VoIPService) this.d).lambda$editCallMember$90(this.f9945b, (Runnable) this.f9946c, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new c9((f9) this.d, tLObject, this.f9945b, (TLRPC.User) this.f9946c, 11));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new l3(tLObject, this.f9945b, (HashSet) this.d, tL_error, (o2) this.f9946c, 14));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new c9((o2) this.d, tLObject, this.f9945b, (Utilities.Callback) this.f9946c, 18));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new c9((e40) this.d, this.f9945b, tLObject, (String) this.f9946c, 20));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new c9((nq0) this.d, this.f9945b, tLObject, (String) this.f9946c, 22));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new oy0((ProfileActivity) this.d, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.f9946c, 0), this.f9945b);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.f9946c;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) vector.objects.get(i10);
                        arrayList.add(tL_premiumGiftCodeOption);
                        String str = tL_premiumGiftCodeOption.store_product;
                        if (str != null) {
                            ?? obj = new Object();
                            obj.f3842b = "inapp";
                            obj.f3841a = str;
                            arrayList2.add(obj.a());
                        }
                    }
                    boolean isEmpty = arrayList2.isEmpty();
                    int i11 = this.f9945b;
                    if (!isEmpty && tg.t.h()) {
                        BillingController.getInstance().queryProductDetails(arrayList2, new fa(arrayList, chat, i11, callback, 9));
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(new tg.p(chat, i11, arrayList, callback, 0));
                        return;
                    }
                }
                return;
        }
    }

    public u(Object obj, int i10, Object obj2, int i11) {
        this.f9944a = i11;
        this.d = obj;
        this.f9945b = i10;
        this.f9946c = obj2;
    }

    public u(ProfileActivity profileActivity, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i10) {
        this.f9944a = 8;
        this.d = profileActivity;
        this.f9946c = tL_channels_getParticipants;
        this.f9945b = i10;
    }
}
