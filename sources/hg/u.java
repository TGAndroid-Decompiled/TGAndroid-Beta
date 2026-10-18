package hg;

import ai.cb;
import ai.ub;
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
import org.telegram.ui.Components.ir0;
import org.telegram.ui.Components.n40;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.f9;
import org.telegram.ui.ha;
import org.telegram.ui.tx0;
public final class u implements RequestDelegate {
    public final int f12064a;
    public final int f12065b;
    public final Object f12066c;
    public final Object d;

    public u(int i10, HashSet hashSet, n2 n2Var) {
        this.f12064a = 4;
        this.f12065b = i10;
        this.d = hashSet;
        this.f12066c = n2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f12064a) {
            case 0:
                h0 h0Var = (h0) this.d;
                h0Var.getClass();
                AndroidUtilities.runOnUIThread(new cb(h0Var, this.f12065b, tLObject, (String) this.f12066c, 5));
                return;
            case 1:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$34(this.f12065b, (String) this.f12066c, tLObject, tL_error);
                return;
            case 2:
                ((VoIPService) this.d).lambda$editCallMember$90(this.f12065b, (Runnable) this.f12066c, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new cb((f9) this.d, tLObject, this.f12065b, (TLRPC.User) this.f12066c, 12));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new ub(tLObject, this.f12065b, (HashSet) this.d, tL_error, (n2) this.f12066c));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new cb((n2) this.d, tLObject, this.f12065b, (Utilities.Callback) this.f12066c, 20));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new cb((n40) this.d, this.f12065b, tLObject, (String) this.f12066c, 22));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new cb((ir0) this.d, this.f12065b, tLObject, (String) this.f12066c, 24));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new tx0((ProfileActivity) this.d, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.f12066c, 0), this.f12065b);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.f12066c;
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
                            obj.f4699b = "inapp";
                            obj.f4698a = str;
                            arrayList2.add(obj.a());
                        }
                    }
                    boolean isEmpty = arrayList2.isEmpty();
                    int i11 = this.f12065b;
                    if (!isEmpty && ug.r.h()) {
                        BillingController.getInstance().queryProductDetails(arrayList2, new ha(arrayList, chat, i11, callback, 10));
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(new ug.n(chat, i11, arrayList, callback, 0));
                        return;
                    }
                }
                return;
        }
    }

    public u(Object obj, int i10, Object obj2, int i11) {
        this.f12064a = i11;
        this.d = obj;
        this.f12065b = i10;
        this.f12066c = obj2;
    }

    public u(ProfileActivity profileActivity, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i10) {
        this.f12064a = 8;
        this.d = profileActivity;
        this.f12066c = tL_channels_getParticipants;
        this.f12065b = i10;
    }
}
