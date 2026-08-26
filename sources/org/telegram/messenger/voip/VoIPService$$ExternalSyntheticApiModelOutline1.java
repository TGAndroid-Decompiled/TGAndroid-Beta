package org.telegram.messenger.voip;

import android.content.ComponentName;
import android.telecom.DisconnectCause;
import android.telecom.PhoneAccount;
import android.telecom.PhoneAccountHandle;

public abstract class VoIPService$$ExternalSyntheticApiModelOutline1 {
    public static DisconnectCause m$2() {
        return new DisconnectCause(1);
    }

    public static DisconnectCause m$1() {
        return new DisconnectCause(7);
    }

    public static void m1042m$2() {
    }

    public static void m1041m$1() {
    }

    public static DisconnectCause m() {
        return new DisconnectCause(3);
    }

    public static DisconnectCause m(int i) {
        return new DisconnectCause(i);
    }

    public static PhoneAccount.Builder m(PhoneAccountHandle phoneAccountHandle, String str) {
        return new PhoneAccount.Builder(phoneAccountHandle, str);
    }

    public static PhoneAccountHandle m(ComponentName componentName, String str) {
        return new PhoneAccountHandle(componentName, str);
    }

    public static void m1040m() {
    }
}
