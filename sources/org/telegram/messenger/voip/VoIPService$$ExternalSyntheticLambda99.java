package org.telegram.messenger.voip;

import com.android.billingclient.api.AccountIdentifiers;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.utils.PhotoUtilities$$ExternalSyntheticLambda1;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.Adapters.DialogsSearchAdapter;
import org.telegram.ui.Components.Premium.boosts.BoostRepository;
import org.telegram.ui.Components.Premium.boosts.BoostRepository$$ExternalSyntheticLambda21;
import org.telegram.ui.web.BotWebViewContainer;

public final class VoIPService$$ExternalSyntheticLambda99 implements RequestDelegate {
    public final int $r8$classId;
    public final Object f$0;
    public final int f$1;
    public final Object f$2;

    public VoIPService$$ExternalSyntheticLambda99(Object obj, int i, Object obj2, int i2) {
        this.$r8$classId = i2;
        this.f$0 = obj;
        this.f$1 = i;
        this.f$2 = obj2;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.$r8$classId) {
            case 0:
                ((VoIPService) this.f$0).lambda$startConferenceGroupCall$34(this.f$1, (String) this.f$2, tLObject, tL_error);
                break;
            case 1:
                ((VoIPService) this.f$0).lambda$editCallMember$90(this.f$1, (Runnable) this.f$2, tLObject, tL_error);
                break;
            case 2:
                ((DialogsSearchAdapter) this.f$0).lambda$searchDialogs$21(this.f$1, (String) this.f$2, tLObject, tL_error);
                break;
            case 3:
                if (tLObject instanceof Vector) {
                    Vector vector = (Vector) tLObject;
                    ArrayList arrayList = new ArrayList();
                    ArrayList arrayList2 = new ArrayList();
                    for (int i = 0; i < vector.objects.size(); i++) {
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) vector.objects.get(i);
                        arrayList.add(tL_premiumGiftCodeOption);
                        String str = tL_premiumGiftCodeOption.store_product;
                        if (str != null) {
                            AccountIdentifiers accountIdentifiers = new AccountIdentifiers();
                            accountIdentifiers.zzb = "inapp";
                            accountIdentifiers.zza = str;
                            arrayList2.add(accountIdentifiers.build());
                        }
                    }
                    boolean zIsEmpty = arrayList2.isEmpty();
                    Utilities.Callback callback = (Utilities.Callback) this.f$2;
                    TLRPC.Chat chat = (TLRPC.Chat) this.f$0;
                    int i2 = this.f$1;
                    if (zIsEmpty || !BoostRepository.isGoogleBillingAvailable()) {
                        AndroidUtilities.runOnUIThread(new BoostRepository$$ExternalSyntheticLambda21(chat, i2, arrayList, callback, 0));
                    } else {
                        BillingController.getInstance().queryProductDetails(arrayList2, new PhotoUtilities$$ExternalSyntheticLambda1(arrayList, chat, i2, callback));
                    }
                }
                break;
            default:
                ((BotWebViewContainer) this.f$0).lambda$onEventReceived$19(this.f$1, (BotWebViewContainer.MyWebView) this.f$2, tLObject, tL_error);
                break;
        }
    }
}
