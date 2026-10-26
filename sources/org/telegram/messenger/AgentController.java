package org.telegram.messenger;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_agent;
public final class AgentController {
    public final int currentAccount;
    public long providersHash;
    private long providersRequestedTime;
    public TL_agent.settings settings;
    public final ArrayList<TL_agent.agentProvider> providers = new ArrayList<>();
    private int providersRequestId = -1;
    private int settingsRequestId = -1;

    public AgentController(int i10) {
        this.currentAccount = i10;
    }

    public static AgentController getInstance(int i10) {
        return MessagesController.getInstance(i10).getAgentController();
    }

    public void lambda$connect$2(Utilities.Callback callback, TL_agent.settings settingsVar, TLRPC.TL_error tL_error) {
        if (settingsVar != null) {
            applySettings(settingsVar);
        }
        if (callback != null) {
            callback.run(tL_error);
        }
    }

    public void lambda$disconnect$3(TL_agent.settings settingsVar, TLRPC.TL_error tL_error) {
        if (settingsVar != null) {
            applySettings(settingsVar);
        }
    }

    public void lambda$loadProviders$0(TL_agent.Providers providers, TLRPC.TL_error tL_error) {
        this.providersRequestId = -1;
        if (providers instanceof TL_agent.TL_providers) {
            this.providersRequestedTime = System.currentTimeMillis();
            TL_agent.TL_providers tL_providers = (TL_agent.TL_providers) providers;
            this.providersHash = tL_providers.hash;
            this.providers.clear();
            this.providers.addAll(tL_providers.providers);
            notifyUpdate();
        } else if (providers instanceof TL_agent.TL_providersNotModified) {
            this.providersRequestedTime = System.currentTimeMillis();
        }
    }

    public void lambda$loadSettings$1(TL_agent.settings settingsVar, TLRPC.TL_error tL_error) {
        this.settingsRequestId = -1;
        if (settingsVar != null) {
            applySettings(settingsVar);
        }
    }

    public void lambda$setActiveProvider$4(TL_agent.settings settingsVar, TLRPC.TL_error tL_error) {
        if (settingsVar != null) {
            applySettings(settingsVar);
        } else {
            loadSettings();
        }
    }

    public void applySettings(TL_agent.settings settingsVar) {
        this.settings = settingsVar;
        notifyUpdate();
    }

    public void connect(String str, String str2, Utilities.Callback<TLRPC.TL_error> callback) {
        TL_agent.connect connectVar = new TL_agent.connect();
        connectVar.provider = str;
        connectVar.key = str2;
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(connectVar, new Object(), new c(0, this, callback));
    }

    public void disconnect(String str) {
        TL_agent.disconnect disconnectVar = new TL_agent.disconnect();
        disconnectVar.provider = str;
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(disconnectVar, new Object(), new b(this, 2));
    }

    public TL_agent.agentProvider getProvider(String str) {
        for (int i10 = 0; i10 < this.providers.size(); i10++) {
            if (TextUtils.equals(this.providers.get(i10).f22237id, str)) {
                return this.providers.get(i10);
            }
        }
        return null;
    }

    public boolean isAgentBot(long j10) {
        return AppGlobalConfig.getInstance(this.currentAccount).agentBotIds.contains(j10);
    }

    public boolean isConnected(String str) {
        if (this.settings == null) {
            return false;
        }
        for (int i10 = 0; i10 < this.settings.keys.size(); i10++) {
            if (TextUtils.equals(this.settings.keys.get(i10).provider, str)) {
                return true;
            }
        }
        return false;
    }

    public void load() {
        loadProviders();
        loadSettings();
    }

    public void loadProviders() {
        if (this.providersRequestId < 0) {
            if (!this.providers.isEmpty() && System.currentTimeMillis() - this.providersRequestedTime < 1800000) {
                return;
            }
            TL_agent.getProviders getproviders = new TL_agent.getProviders();
            getproviders.hash = this.providersHash;
            this.providersRequestId = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(getproviders, new Object(), new b(this, 3));
        }
    }

    public void loadSettings() {
        if (this.settingsRequestId >= 0) {
            return;
        }
        this.settingsRequestId = ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(new TL_agent.getSettings(), new Object(), new b(this, 0));
    }

    public void notifyUpdate() {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.agentSettingsUpdated, new Object[0]);
    }

    public void setActiveProvider(String str) {
        TL_agent.settings settingsVar = this.settings;
        if (settingsVar != null) {
            settingsVar.active_provider = str;
            notifyUpdate();
        }
        TL_agent.setActiveProvider setactiveprovider = new TL_agent.setActiveProvider();
        setactiveprovider.provider = str;
        ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(setactiveprovider, new Object(), new b(this, 1));
    }
}
