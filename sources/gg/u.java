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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.ar0;
import org.telegram.ui.Components.e40;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.e9;
import org.telegram.ui.ea;
import org.telegram.ui.my0;
public final class u implements RequestDelegate {
    public final int f9943a;
    public final int f9944b;
    public final Object f9945c;
    public final Object d;

    public u(int i10, HashSet hashSet, n2 n2Var) {
        this.f9943a = 4;
        this.f9944b = i10;
        this.d = hashSet;
        this.f9945c = n2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f9943a) {
            case 0:
                i0 i0Var = (i0) this.d;
                i0Var.getClass();
                AndroidUtilities.runOnUIThread(new c9(i0Var, this.f9944b, tLObject, (String) this.f9945c, 4));
                return;
            case 1:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$34(this.f9944b, (String) this.f9945c, tLObject, tL_error);
                return;
            case 2:
                ((VoIPService) this.d).lambda$editCallMember$90(this.f9944b, (Runnable) this.f9945c, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new c9((e9) this.d, tLObject, this.f9944b, (TLRPC.User) this.f9945c, 11));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new l3(tLObject, this.f9944b, (HashSet) this.d, tL_error, (n2) this.f9945c, 15));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new c9((n2) this.d, tLObject, this.f9944b, (Utilities.Callback) this.f9945c, 18));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new c9((e40) this.d, this.f9944b, tLObject, (String) this.f9945c, 20));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new c9((ar0) this.d, this.f9944b, tLObject, (String) this.f9945c, 22));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new my0((ProfileActivity) this.d, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.f9945c, 0), this.f9944b);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.f9945c;
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
                    int i11 = this.f9944b;
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
        this.f9943a = i11;
        this.d = obj;
        this.f9944b = i10;
        this.f9945c = obj2;
    }

    public u(ProfileActivity profileActivity, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i10) {
        this.f9943a = 8;
        this.d = profileActivity;
        this.f9945c = tL_channels_getParticipants;
        this.f9944b = i10;
    }
}
