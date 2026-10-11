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
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.tr0;
import org.telegram.ui.Components.w40;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b9;
import org.telegram.ui.da;
import org.telegram.ui.ky0;
public final class u implements RequestDelegate {
    public final int f10821a;
    public final int f10822b;
    public final Object f10823c;
    public final Object d;

    public u(int i10, HashSet hashSet, m2 m2Var) {
        this.f10821a = 4;
        this.f10822b = i10;
        this.d = hashSet;
        this.f10823c = m2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10821a) {
            case 0:
                h0 h0Var = (h0) this.d;
                h0Var.getClass();
                AndroidUtilities.runOnUIThread(new d9(h0Var, this.f10822b, tLObject, (String) this.f10823c, 4));
                return;
            case 1:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$34(this.f10822b, (String) this.f10823c, tLObject, tL_error);
                return;
            case 2:
                ((VoIPService) this.d).lambda$editCallMember$90(this.f10822b, (Runnable) this.f10823c, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new d9((b9) this.d, tLObject, this.f10822b, (TLRPC.User) this.f10823c, 11));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new l3(tLObject, this.f10822b, (HashSet) this.d, tL_error, (m2) this.f10823c, 15));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new d9((m2) this.d, tLObject, this.f10822b, (Utilities.Callback) this.f10823c, 19));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new d9((w40) this.d, this.f10822b, tLObject, (String) this.f10823c, 21));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new d9((tr0) this.d, this.f10822b, tLObject, (String) this.f10823c, 23));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ky0((ProfileActivity) this.d, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.f10823c, 0), this.f10822b);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.f10823c;
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
                            obj.f4198b = "inapp";
                            obj.f4197a = str;
                            arrayList2.add(obj.a());
                        }
                    }
                    boolean isEmpty = arrayList2.isEmpty();
                    int i11 = this.f10822b;
                    if (!isEmpty && tg.r.h()) {
                        BillingController.getInstance().queryProductDetails(arrayList2, new da(arrayList, chat, i11, callback, 9));
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
        this.f10821a = i11;
        this.d = obj;
        this.f10822b = i10;
        this.f10823c = obj2;
    }

    public u(ProfileActivity profileActivity, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i10) {
        this.f10821a = 8;
        this.d = profileActivity;
        this.f10823c = tL_channels_getParticipants;
        this.f10822b = i10;
    }
}
