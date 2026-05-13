package org.telegram.messenger.car;

import android.content.Intent;
import androidx.car.app.Screen;
import androidx.car.app.Session;

public class TelegramCarSession extends Session {
    @Override
    public Screen onCreateScreen(Intent intent) {
        return new HomeScreen(getCarContext());
    }
}
