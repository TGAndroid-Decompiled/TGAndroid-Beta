package org.telegram.messenger.car;

import androidx.car.app.CarAppService;
import androidx.car.app.R$array;
import androidx.car.app.Session;
import androidx.car.app.validation.HostValidator;
import org.telegram.messenger.BuildVars;

public class TelegramCarAppService extends CarAppService {
    @Override
    public HostValidator createHostValidator() {
        if (BuildVars.DEBUG_VERSION) {
            return HostValidator.ALLOW_ALL_HOSTS_VALIDATOR;
        }
        return new HostValidator.Builder(getApplicationContext()).addAllowedHosts(R$array.hosts_allowlist_sample).build();
    }

    @Override
    public Session onCreateSession() {
        return new TelegramCarSession();
    }
}
