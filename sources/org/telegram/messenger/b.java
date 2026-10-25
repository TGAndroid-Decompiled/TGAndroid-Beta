package org.telegram.messenger;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_agent;
public final class b implements Utilities.Callback2 {
    public final int f19668a;
    public final AgentController f19669b;

    public b(AgentController agentController, int i10) {
        this.f19668a = i10;
        this.f19669b = agentController;
    }

    @Override
    public final void run(Object obj, Object obj2) {
        switch (this.f19668a) {
            case 0:
                this.f19669b.lambda$loadSettings$1((TL_agent.settings) obj, (TLRPC.TL_error) obj2);
                return;
            case 1:
                this.f19669b.lambda$setActiveProvider$4((TL_agent.settings) obj, (TLRPC.TL_error) obj2);
                return;
            case 2:
                this.f19669b.lambda$disconnect$3((TL_agent.settings) obj, (TLRPC.TL_error) obj2);
                return;
            default:
                this.f19669b.lambda$loadProviders$0((TL_agent.Providers) obj, (TLRPC.TL_error) obj2);
                return;
        }
    }
}
