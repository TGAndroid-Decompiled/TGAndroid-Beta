package ig;

import bi.sb;
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
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.p40;
import org.telegram.ui.Components.rr0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.h9;
import org.telegram.ui.o9;
import org.telegram.ui.vx0;
public final class u implements RequestDelegate {
    public final int f14258a;
    public final int f14259b;
    public final Object f14260c;
    public final Object d;

    public u(int i10, HashSet hashSet, o9 o9Var) {
        this.f14258a = 4;
        this.f14259b = i10;
        this.d = hashSet;
        this.f14260c = o9Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f14258a;
        int i11 = this.f14259b;
        Object obj = this.f14260c;
        Object obj2 = this.d;
        switch (i10) {
            case 0:
                i0 i0Var = (i0) obj2;
                i0Var.getClass();
                AndroidUtilities.runOnUIThread(new ai.h1((Object) i0Var, this.f14259b, (Object) tLObject, (String) obj, 7));
                return;
            case 1:
                ((VoIPService) obj2).lambda$startConferenceGroupCall$34(i11, (String) obj, tLObject, tL_error);
                return;
            case 2:
                ((VoIPService) obj2).lambda$editCallMember$90(i11, (Runnable) obj, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ai.h1((h9) obj2, tLObject, this.f14259b, (TLRPC.User) obj, 15));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new sb(tLObject, this.f14259b, (HashSet) obj2, tL_error, (o9) obj));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ai.h1((r2) obj2, tLObject, this.f14259b, (Utilities.Callback) obj, 23));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ai.h1((Object) ((p40) obj2), this.f14259b, (Object) tLObject, (String) obj, 25));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new ai.h1((Object) ((rr0) obj2), this.f14259b, (Object) tLObject, (String) obj, 27));
                return;
            case 8:
                int i12 = ProfileActivity.R6;
                AndroidUtilities.runOnUIThread(new vx0((ProfileActivity) obj2, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) obj, 0), i11);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) obj2;
                Utilities.Callback callback = (Utilities.Callback) obj;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i13 = 0; i13 < vector.objects.size(); i13++) {
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) vector.objects.get(i13);
                        arrayList.add(tL_premiumGiftCodeOption);
                        String str = tL_premiumGiftCodeOption.store_product;
                        if (str != null) {
                            ?? obj3 = new Object();
                            obj3.f7929b = "inapp";
                            obj3.f7928a = str;
                            arrayList2.add(obj3.a());
                        }
                    }
                    boolean isEmpty = arrayList2.isEmpty();
                    int i14 = this.f14259b;
                    if (!isEmpty && vg.s.h()) {
                        BillingController.getInstance().queryProductDetails(arrayList2, new ag.k0(arrayList, chat, i14, callback, 11));
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(new vg.o(chat, i14, arrayList, callback, 0));
                        return;
                    }
                }
                return;
        }
    }

    public u(Object obj, int i10, Object obj2, int i11) {
        this.f14258a = i11;
        this.d = obj;
        this.f14259b = i10;
        this.f14260c = obj2;
    }

    public u(ProfileActivity profileActivity, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i10) {
        this.f14258a = 8;
        this.d = profileActivity;
        this.f14260c = tL_channels_getParticipants;
        this.f14259b = i10;
    }
}
