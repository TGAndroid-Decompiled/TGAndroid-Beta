package hg;

import ai.db;
import ai.vb;
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
import org.telegram.ui.Components.l40;
import org.telegram.ui.Components.mr0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.f9;
import org.telegram.ui.fa;
import org.telegram.ui.tx0;
public final class u implements RequestDelegate {
    public final int f12093a;
    public final int f12094b;
    public final Object f12095c;
    public final Object d;

    public u(int i10, HashSet hashSet, o2 o2Var) {
        this.f12093a = 4;
        this.f12094b = i10;
        this.d = hashSet;
        this.f12095c = o2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12093a) {
            case 0:
                h0 h0Var = (h0) this.d;
                h0Var.getClass();
                AndroidUtilities.runOnUIThread(new db(h0Var, this.f12094b, tLObject, (String) this.f12095c, 5));
                return;
            case 1:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$34(this.f12094b, (String) this.f12095c, tLObject, tL_error);
                return;
            case 2:
                ((VoIPService) this.d).lambda$editCallMember$90(this.f12094b, (Runnable) this.f12095c, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new db((f9) this.d, tLObject, this.f12094b, (TLRPC.User) this.f12095c, 13));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new vb(tLObject, this.f12094b, (HashSet) this.d, tL_error, (o2) this.f12095c));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new db((o2) this.d, tLObject, this.f12094b, (Utilities.Callback) this.f12095c, 21));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new db((l40) this.d, this.f12094b, tLObject, (String) this.f12095c, 23));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new db((mr0) this.d, this.f12094b, tLObject, (String) this.f12095c, 25));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new tx0((ProfileActivity) this.d, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.f12095c, 0), this.f12094b);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.f12095c;
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
                            obj.f4700b = "inapp";
                            obj.f4699a = str;
                            arrayList2.add(obj.a());
                        }
                    }
                    boolean isEmpty = arrayList2.isEmpty();
                    int i11 = this.f12094b;
                    if (!isEmpty && ug.q.h()) {
                        BillingController.getInstance().queryProductDetails(arrayList2, new fa(arrayList, chat, i11, callback, 10));
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(new ug.m(chat, i11, arrayList, callback, 0));
                        return;
                    }
                }
                return;
        }
    }

    public u(Object obj, int i10, Object obj2, int i11) {
        this.f12093a = i11;
        this.d = obj;
        this.f12094b = i10;
        this.f12095c = obj2;
    }

    public u(ProfileActivity profileActivity, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i10) {
        this.f12093a = 8;
        this.d = profileActivity;
        this.f12095c = tL_channels_getParticipants;
        this.f12094b = i10;
    }
}
