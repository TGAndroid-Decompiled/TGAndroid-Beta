package gg;

import ai.c9;
import ei.m3;
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
import org.telegram.ui.Components.er0;
import org.telegram.ui.Components.i40;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.f9;
import org.telegram.ui.fa;
import org.telegram.ui.gy0;
public final class u implements RequestDelegate {
    public final int f10807a;
    public final int f10808b;
    public final Object f10809c;
    public final Object d;

    public u(int i10, HashSet hashSet, n2 n2Var) {
        this.f10807a = 4;
        this.f10808b = i10;
        this.d = hashSet;
        this.f10809c = n2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10807a) {
            case 0:
                i0 i0Var = (i0) this.d;
                i0Var.getClass();
                AndroidUtilities.runOnUIThread(new c9(i0Var, this.f10808b, tLObject, (String) this.f10809c, 4));
                return;
            case 1:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$34(this.f10808b, (String) this.f10809c, tLObject, tL_error);
                return;
            case 2:
                ((VoIPService) this.d).lambda$editCallMember$90(this.f10808b, (Runnable) this.f10809c, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new c9((f9) this.d, tLObject, this.f10808b, (TLRPC.User) this.f10809c, 11));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new m3(tLObject, this.f10808b, (HashSet) this.d, tL_error, (n2) this.f10809c, 15));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new c9((n2) this.d, tLObject, this.f10808b, (Utilities.Callback) this.f10809c, 18));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new c9((i40) this.d, this.f10808b, tLObject, (String) this.f10809c, 20));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new c9((er0) this.d, this.f10808b, tLObject, (String) this.f10809c, 22));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new gy0((ProfileActivity) this.d, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.f10809c, 0), this.f10808b);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.f10809c;
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
                            obj.f4148b = "inapp";
                            obj.f4147a = str;
                            arrayList2.add(obj.a());
                        }
                    }
                    boolean isEmpty = arrayList2.isEmpty();
                    int i11 = this.f10808b;
                    if (!isEmpty && tg.s.h()) {
                        BillingController.getInstance().queryProductDetails(arrayList2, new fa(arrayList, chat, i11, callback, 9));
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
        this.f10807a = i11;
        this.d = obj;
        this.f10808b = i10;
        this.f10809c = obj2;
    }

    public u(ProfileActivity profileActivity, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i10) {
        this.f10807a = 8;
        this.d = profileActivity;
        this.f10809c = tL_channels_getParticipants;
        this.f10808b = i10;
    }
}
