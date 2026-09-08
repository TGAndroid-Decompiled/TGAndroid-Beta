package hg;

import bi.k8;
import fi.l3;
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
import org.telegram.ui.Components.e40;
import org.telegram.ui.Components.mq0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.d9;
import org.telegram.ui.da;
import org.telegram.ui.my0;
public final class u implements RequestDelegate {
    public final int f11292a;
    public final int f11293b;
    public final Object f11294c;
    public final Object d;

    public u(int i10, HashSet hashSet, n2 n2Var) {
        this.f11292a = 4;
        this.f11293b = i10;
        this.d = hashSet;
        this.f11294c = n2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f11292a) {
            case 0:
                i0 i0Var = (i0) this.d;
                i0Var.getClass();
                AndroidUtilities.runOnUIThread(new k8(i0Var, this.f11293b, tLObject, (String) this.f11294c, 4));
                return;
            case 1:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$34(this.f11293b, (String) this.f11294c, tLObject, tL_error);
                return;
            case 2:
                ((VoIPService) this.d).lambda$editCallMember$90(this.f11293b, (Runnable) this.f11294c, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new k8((d9) this.d, tLObject, this.f11293b, (TLRPC.User) this.f11294c, 11));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new l3(tLObject, this.f11293b, (HashSet) this.d, tL_error, (n2) this.f11294c, 14));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new k8((n2) this.d, tLObject, this.f11293b, (Utilities.Callback) this.f11294c, 18));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new k8((e40) this.d, this.f11293b, tLObject, (String) this.f11294c, 20));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new k8((mq0) this.d, this.f11293b, tLObject, (String) this.f11294c, 22));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new my0((ProfileActivity) this.d, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.f11294c, 0), this.f11293b);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.f11294c;
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
                            obj.f4369b = "inapp";
                            obj.f4368a = str;
                            arrayList2.add(obj.a());
                        }
                    }
                    boolean isEmpty = arrayList2.isEmpty();
                    int i11 = this.f11293b;
                    if (!isEmpty && ug.t.h()) {
                        BillingController.getInstance().queryProductDetails(arrayList2, new da(arrayList, chat, i11, callback, 9));
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(new ug.o(chat, i11, arrayList, callback, 0));
                        return;
                    }
                }
                return;
        }
    }

    public u(Object obj, int i10, Object obj2, int i11) {
        this.f11292a = i11;
        this.d = obj;
        this.f11293b = i10;
        this.f11294c = obj2;
    }

    public u(ProfileActivity profileActivity, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i10) {
        this.f11292a = 8;
        this.d = profileActivity;
        this.f11294c = tL_channels_getParticipants;
        this.f11293b = i10;
    }
}
