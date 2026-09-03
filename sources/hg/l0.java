package hg;

import eg.d3;
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
import org.telegram.ui.Components.i40;
import org.telegram.ui.Components.qq0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.dt;
import org.telegram.ui.e9;
import org.telegram.ui.yx0;
public final class l0 implements RequestDelegate {
    public final int f7552a;
    public final int f7553b;
    public final Object f7554c;
    public final Object d;

    public l0(int i10, HashSet hashSet, org.telegram.ui.ActionBar.p2 p2Var) {
        this.f7552a = 4;
        this.f7553b = i10;
        this.f7554c = hashSet;
        this.d = p2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f7552a) {
            case 0:
                TLRPC.Chat chat = (TLRPC.Chat) this.f7554c;
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
                            b6.h hVar = new b6.h();
                            hVar.f1729c = "inapp";
                            hVar.f1728b = str;
                            arrayList2.add(hVar.a());
                        }
                    }
                    boolean isEmpty = arrayList2.isEmpty();
                    int i11 = this.f7553b;
                    if (!isEmpty && p0.h()) {
                        BillingController.getInstance().queryProductDetails(arrayList2, new a0(arrayList, chat, i11, callback, 0));
                        return;
                    } else {
                        AndroidUtilities.runOnUIThread(new z(chat, i11, arrayList, callback, 0));
                        return;
                    }
                }
                return;
            case 1:
                ((VoIPService) this.f7554c).lambda$startConferenceGroupCall$34(this.f7553b, (String) this.d, tLObject, tL_error);
                return;
            case 2:
                ((VoIPService) this.f7554c).lambda$editCallMember$90(this.f7553b, (Runnable) this.d, tLObject, tL_error);
                return;
            case 3:
                AndroidUtilities.runOnUIThread(new dg.u1((e9) this.f7554c, tLObject, this.f7553b, (TLRPC.User) this.d, 10));
                return;
            case 4:
                AndroidUtilities.runOnUIThread(new d3(tLObject, this.f7553b, (HashSet) this.f7554c, tL_error, (org.telegram.ui.ActionBar.p2) this.d, 11));
                return;
            case 5:
                AndroidUtilities.runOnUIThread(new dg.u1((org.telegram.ui.ActionBar.p2) this.f7554c, tLObject, this.f7553b, (Utilities.Callback) this.d, 17));
                return;
            case 6:
                AndroidUtilities.runOnUIThread(new dg.u1((i40) this.f7554c, this.f7553b, tLObject, (String) this.d, 19));
                return;
            case 7:
                AndroidUtilities.runOnUIThread(new dg.u1((qq0) this.f7554c, this.f7553b, tLObject, (String) this.d, 21));
                return;
            case 8:
                AndroidUtilities.runOnUIThread(new yx0((ProfileActivity) this.f7554c, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.d, 0), this.f7553b);
                return;
            case 9:
                AndroidUtilities.runOnUIThread(new d3((org.telegram.ui.web.a1) this.f7554c, tLObject, this.f7553b, (org.telegram.ui.web.x0) this.d, tL_error, 25));
                return;
            default:
                uf.z zVar = (uf.z) this.f7554c;
                zVar.getClass();
                AndroidUtilities.runOnUIThread(new dt(zVar, this.f7553b, tLObject, (String) this.d, 15));
                return;
        }
    }

    public l0(Object obj, int i10, Object obj2, int i11) {
        this.f7552a = i11;
        this.f7554c = obj;
        this.f7553b = i10;
        this.d = obj2;
    }

    public l0(ProfileActivity profileActivity, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i10) {
        this.f7552a = 8;
        this.f7554c = profileActivity;
        this.d = tL_channels_getParticipants;
        this.f7553b = i10;
    }
}
