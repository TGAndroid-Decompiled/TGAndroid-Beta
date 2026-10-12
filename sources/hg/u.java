package hg;

import bi.n8;
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
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.or0;
import org.telegram.ui.Components.r40;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.g9;
import org.telegram.ui.ia;
import org.telegram.ui.ry0;
public final class u implements RequestDelegate {
    public final int f10755a;
    public final int f10756b;
    public final Object f10757c;
    public final Object d;

    public u(int i10, HashSet hashSet, m2 m2Var) {
        this.f10755a = 4;
        this.f10756b = i10;
        this.d = hashSet;
        this.f10757c = m2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f10755a) {
            case 0:
                h0 h0Var = (h0) this.d;
                h0Var.getClass();
                AndroidUtilities.runOnUIThread(new n8(h0Var, this.f10756b, tLObject, (String) this.f10757c, 4));
                return;
            case 1:
                ((VoIPService) this.d).lambda$startConferenceGroupCall$34(this.f10756b, (String) this.f10757c, tLObject, tL_error);
                return;
            case 2:
                ((VoIPService) this.d).lambda$editCallMember$90(this.f10756b, (Runnable) this.f10757c, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new n8((g9) this.d, tLObject, this.f10756b, (TLRPC.User) this.f10757c, 11));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new l3(tLObject, this.f10756b, (HashSet) this.d, tL_error, (m2) this.f10757c, 15));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new n8((m2) this.d, tLObject, this.f10756b, (Utilities.Callback) this.f10757c, 19));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new n8((r40) this.d, this.f10756b, tLObject, (String) this.f10757c, 21));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new n8((or0) this.d, this.f10756b, tLObject, (String) this.f10757c, 23));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new ry0((ProfileActivity) this.d, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.f10757c, 0), this.f10756b);
                return;
            default:
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                Utilities.Callback callback = (Utilities.Callback) this.f10757c;
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i10 = 0; i10 < vector.objects.size(); i10++) {
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) vector.objects.get(i10);
                        arrayList.add(tL_premiumGiftCodeOption);
                        String str = tL_premiumGiftCodeOption.store_product;
                        if (str != null) {
                            c5.a aVar = new c5.a();
                            aVar.f4324c = "inapp";
                            aVar.f4323b = str;
                            arrayList2.add(aVar.a());
                        }
                    }
                    boolean isEmpty = arrayList2.isEmpty();
                    int i11 = this.f10756b;
                    if (!isEmpty && ug.s.h()) {
                        BillingController.getInstance().queryProductDetails(arrayList2, new ia(arrayList, chat, i11, callback, 10));
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
        this.f10755a = i11;
        this.d = obj;
        this.f10756b = i10;
        this.f10757c = obj2;
    }

    public u(ProfileActivity profileActivity, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i10) {
        this.f10755a = 8;
        this.d = profileActivity;
        this.f10757c = tL_channels_getParticipants;
        this.f10756b = i10;
    }
}
