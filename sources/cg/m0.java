package cg;

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
import org.telegram.ui.Components.t30;
import org.telegram.ui.Components.xp0;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c9;
import org.telegram.ui.ix0;
import org.telegram.ui.xs;

public final class m0 implements RequestDelegate {

    public final int f2770a;

    public final int f2771b;

    public final Object f2772c;
    public final Object d;

    public m0(int i10, HashSet hashSet, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f2770a = 4;
        this.f2771b = i10;
        this.f2772c = hashSet;
        this.d = n2Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f2770a) {
            case 0:
                TLRPC.Chat chat = (TLRPC.Chat) this.f2772c;
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
                            c9.b bVar = new c9.b();
                            bVar.f2567c = "inapp";
                            bVar.f2566b = str;
                            arrayList2.add(bVar.a());
                        }
                    }
                    boolean zIsEmpty = arrayList2.isEmpty();
                    int i11 = this.f2771b;
                    if (zIsEmpty || !q0.h()) {
                        AndroidUtilities.runOnUIThread(new z(chat, i11, arrayList, callback, 0));
                    } else {
                        BillingController.getInstance().queryProductDetails(arrayList2, new a0(arrayList, chat, i11, callback, 0));
                    }
                }
                break;
            case 1:
                ((VoIPService) this.f2772c).lambda$startConferenceGroupCall$34(this.f2771b, (String) this.d, tLObject, tL_error);
                break;
            case 2:
                ((VoIPService) this.f2772c).lambda$editCallMember$90(this.f2771b, (Runnable) this.d, tLObject, tL_error);
                break;
            case 3:
                AndroidUtilities.runOnUIThread(new ag.k0((c9) this.f2772c, tLObject, this.f2771b, (TLRPC.User) this.d, 10));
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new gh.e1(tLObject, this.f2771b, (HashSet) this.f2772c, tL_error, (org.telegram.ui.ActionBar.n2) this.d, 12));
                break;
            case 5:
                AndroidUtilities.runOnUIThread(new ag.k0((org.telegram.ui.ActionBar.n2) this.f2772c, tLObject, this.f2771b, (Utilities.Callback) this.d, 17));
                break;
            case 6:
                AndroidUtilities.runOnUIThread(new ag.k0((t30) this.f2772c, this.f2771b, tLObject, (String) this.d, 19));
                break;
            case 7:
                AndroidUtilities.runOnUIThread(new ag.k0((xp0) this.f2772c, this.f2771b, tLObject, (String) this.d, 21));
                break;
            case 8:
                AndroidUtilities.runOnUIThread(new ix0((ProfileActivity) this.f2772c, tL_error, tLObject, (TLRPC.TL_channels_getParticipants) this.d, 0), this.f2771b);
                break;
            case 9:
                AndroidUtilities.runOnUIThread(new gh.e1((org.telegram.ui.web.z0) this.f2772c, tLObject, this.f2771b, (org.telegram.ui.web.w0) this.d, tL_error, 26));
                break;
            default:
                pf.z zVar = (pf.z) this.f2772c;
                String str2 = (String) this.d;
                zVar.getClass();
                AndroidUtilities.runOnUIThread(new xs(zVar, this.f2771b, tLObject, str2, 13));
                break;
        }
    }

    public m0(Object obj, int i10, Object obj2, int i11) {
        this.f2770a = i11;
        this.f2772c = obj;
        this.f2771b = i10;
        this.d = obj2;
    }

    public m0(ProfileActivity profileActivity, TLRPC.TL_channels_getParticipants tL_channels_getParticipants, int i10) {
        this.f2770a = 8;
        this.f2772c = profileActivity;
        this.d = tL_channels_getParticipants;
        this.f2771b = i10;
    }
}
