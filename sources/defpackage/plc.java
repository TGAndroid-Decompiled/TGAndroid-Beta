package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.voip.VoIPService;
public final class plc implements Runnable {
    public final byte a;
    public final VoIPService b;
    public final ArrayList c;
    public final ArrayList d;
    public final ArrayList e;
    public final String f;

    public plc(VoIPService voIPService, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, String str, byte b) {
        this.a = b;
        this.b = voIPService;
        this.c = arrayList;
        this.d = arrayList2;
        this.e = arrayList3;
        this.f = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.f;
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.d;
        ArrayList arrayList3 = this.c;
        VoIPService voIPService = this.b;
        switch (b) {
            case 0:
                voIPService.lambda$startConferenceGroupCall$50(arrayList3, arrayList2, arrayList, str);
                return;
            default:
                voIPService.lambda$startConferenceGroupCall$42(arrayList3, arrayList2, arrayList, str);
                return;
        }
    }
}
