package bg;

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
import org.telegram.ui.Components.o30;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.b9;
import org.telegram.ui.hx0;
public final class q0 implements RequestDelegate {
    public final int f1919a;
    public final int f1920b;
    public final Object f1921c;
    public final Object d;

    public q0(int i9, HashSet hashSet, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f1919a = 5;
        this.f1920b = i9;
        this.f1921c = hashSet;
        this.d = o2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f1919a) {
            case 0:
                TLRPC.Chat chat = (TLRPC.Chat) this.f1921c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i9 = 0; i9 < vector.objects.size(); i9++) {
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) vector.objects.get(i9);
                        arrayList.add(tL_premiumGiftCodeOption);
                        String str = tL_premiumGiftCodeOption.store_product;
                        if (str != null) {
                            b9.c cVar = new b9.c();
                            cVar.f1663c = "inapp";
                            cVar.f1662b = str;
                            arrayList2.add(cVar.a());
                        }
                    }
                    boolean isEmpty = arrayList2.isEmpty();
                    int i10 = this.f1920b;
                    if (!isEmpty && u0.h()) {
                        BillingController.getInstance().queryProductDetails(arrayList2, new d0(arrayList, chat, i10, callback, 0));
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(new c0(chat, i10, arrayList, callback, 0));
                        return;
                    }
                }
                return;
            case 1:
                of.f0 f0Var = (of.f0) this.f1921c;
                f0Var.getClass();
                AndroidUtilities.runOnUIThread(new c3.d(f0Var, this.f1920b, tLObject, (String) this.d, 6));
                return;
            case 2:
                ((VoIPService) this.f1921c).lambda$startConferenceGroupCall$34(this.f1920b, (String) this.d, tLObject, tL_error);
                return;
            case 3:
                ((VoIPService) this.f1921c).lambda$editCallMember$90(this.f1920b, (Runnable) this.d, tLObject, tL_error);
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new c3.d((b9) this.f1921c, tLObject, this.f1920b, (TLRPC.User) this.d, 11));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new fh.g1(tLObject, this.f1920b, (HashSet) this.f1921c, tL_error, (org.telegram.ui.ActionBar.o2) this.d, 14));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new c3.d((org.telegram.ui.ActionBar.o2) this.f1921c, tLObject, this.f1920b, (Utilities.Callback) this.d, 18));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new c3.d((o30) this.f1921c, this.f1920b, tLObject, (String) this.d, 20));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new c3.d((wp0) this.f1921c, this.f1920b, tLObject, (String) this.d, 22));
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new hx0((ProfileActivity) this.f1921c, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.d, 0), this.f1920b);
                return;
            default:
                AndroidUtilities.runOnUIThread(new fh.g1((org.telegram.ui.web.y0) this.f1921c, tLObject, this.f1920b, (org.telegram.ui.web.v0) this.d, tL_error, 28));
                return;
        }
    }

    public q0(Object obj, int i9, Object obj2, int i10) {
        this.f1919a = i10;
        this.f1921c = obj;
        this.f1920b = i9;
        this.d = obj2;
    }

    public q0(ProfileActivity profileActivity, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i9) {
        this.f1919a = 9;
        this.f1921c = profileActivity;
        this.d = tL_channels_getParticipants;
        this.f1920b = i9;
    }
}
