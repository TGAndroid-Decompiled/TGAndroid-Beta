package defpackage;

import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_agent;
public final class lc implements jac {
    public final byte a;
    public final mc b;

    public lc(mc mcVar, byte b) {
        this.a = b;
        this.b = mcVar;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        byte b = this.a;
        mc mcVar = this.b;
        switch (b) {
            case 0:
                TL_agent.settings settingsVar = (TL_agent.settings) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                mcVar.h = -1;
                if (settingsVar != null) {
                    mcVar.e = true;
                    mcVar.a(settingsVar);
                    return;
                }
                return;
            case 1:
                TL_agent.Providers providers = (TL_agent.Providers) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                ArrayList arrayList = mcVar.b;
                mcVar.f = -1;
                if (providers instanceof TL_agent.TL_providers) {
                    mcVar.g = System.currentTimeMillis();
                    TL_agent.TL_providers tL_providers = (TL_agent.TL_providers) providers;
                    mcVar.c = tL_providers.hash;
                    arrayList.clear();
                    arrayList.addAll(tL_providers.providers);
                    mcVar.i();
                    return;
                } else if (providers instanceof TL_agent.TL_providersNotModified) {
                    mcVar.g = System.currentTimeMillis();
                    return;
                } else {
                    return;
                }
            case 2:
                TL_agent.settings settingsVar2 = (TL_agent.settings) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (settingsVar2 != null) {
                    mcVar.a(settingsVar2);
                    return;
                } else {
                    mcVar.h();
                    return;
                }
            case 3:
                TL_agent.settings settingsVar3 = (TL_agent.settings) obj;
                TLRPC.TL_error tL_error4 = (TLRPC.TL_error) obj2;
                if (settingsVar3 != null) {
                    mcVar.a(settingsVar3);
                    return;
                }
                return;
            case 4:
                TL_agent.settings settingsVar4 = (TL_agent.settings) obj;
                TLRPC.TL_error tL_error5 = (TLRPC.TL_error) obj2;
                if (settingsVar4 != null) {
                    mcVar.a(settingsVar4);
                    return;
                } else {
                    mcVar.h();
                    return;
                }
            default:
                TL_agent.settings settingsVar5 = (TL_agent.settings) obj;
                TLRPC.TL_error tL_error6 = (TLRPC.TL_error) obj2;
                if (settingsVar5 != null) {
                    mcVar.a(settingsVar5);
                    return;
                } else {
                    mcVar.h();
                    return;
                }
        }
    }
}
