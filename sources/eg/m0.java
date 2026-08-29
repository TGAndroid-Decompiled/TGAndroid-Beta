package eg;

import bg.j3;
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
import org.telegram.ui.Components.c40;
import org.telegram.ui.Components.iq0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.a9;
import org.telegram.ui.gx0;
import org.telegram.ui.vs;
public final class m0 implements RequestDelegate {
    public final int f6084a;
    public final int f6085b;
    public final Object f6086c;
    public final Object d;

    public m0(int i10, HashSet hashSet, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f6084a = 4;
        this.f6085b = i10;
        this.f6086c = hashSet;
        this.d = o2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f6084a) {
            case 0:
                TLRPC.Chat chat = (TLRPC.Chat) this.f6086c;
                Utilities.Callback callback = (Utilities.Callback) this.d;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) vector.objects.get(i10);
                        arrayList.add(tL_premiumGiftCodeOption);
                        String str = tL_premiumGiftCodeOption.store_product;
                        if (str != null) {
                            d9.c cVar = new d9.c();
                            cVar.f5537c = "inapp";
                            cVar.f5536b = str;
                            arrayList2.add(cVar.a());
                        }
                    }
                    boolean isEmpty = arrayList2.isEmpty();
                    int i11 = this.f6085b;
                    if (!isEmpty && q0.h()) {
                        BillingController.getInstance().queryProductDetails(arrayList2, new b0(arrayList, chat, i11, callback, 0));
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(new a0(chat, i11, arrayList, callback, 0));
                        return;
                    }
                }
                return;
            case 1:
                ((VoIPService) this.f6086c).lambda$startConferenceGroupCall$34(this.f6085b, (String) this.d, tLObject, tL_error);
                return;
            case 2:
                ((VoIPService) this.f6086c).lambda$editCallMember$90(this.f6085b, (Runnable) this.d, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new ag.z1((a9) this.f6086c, tLObject, this.f6085b, (TLRPC.User) this.d, 10));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new j3(tLObject, this.f6085b, (HashSet) this.f6086c, tL_error, (org.telegram.ui.ActionBar.o2) this.d, 11));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new ag.z1((org.telegram.ui.ActionBar.o2) this.f6086c, tLObject, this.f6085b, (Utilities.Callback) this.d, 17));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new ag.z1((c40) this.f6086c, this.f6085b, tLObject, (String) this.d, 19));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new ag.z1((iq0) this.f6086c, this.f6085b, tLObject, (String) this.d, 21));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new gx0((ProfileActivity) this.f6086c, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.d, 0), this.f6085b);
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new j3((org.telegram.ui.web.z0) this.f6086c, tLObject, this.f6085b, (org.telegram.ui.web.w0) this.d, tL_error, 25));
                return;
            default:
                rf.a0 a0Var = (rf.a0) this.f6086c;
                a0Var.getClass();
                AndroidUtilities.runOnUIThread(new vs(a0Var, this.f6085b, tLObject, (String) this.d, 15));
                return;
        }
    }

    public m0(Object obj, int i10, Object obj2, int i11) {
        this.f6084a = i11;
        this.f6086c = obj;
        this.f6085b = i10;
        this.d = obj2;
    }

    public m0(ProfileActivity profileActivity, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i10) {
        this.f6084a = 8;
        this.f6086c = profileActivity;
        this.d = tL_channels_getParticipants;
        this.f6085b = i10;
    }
}
