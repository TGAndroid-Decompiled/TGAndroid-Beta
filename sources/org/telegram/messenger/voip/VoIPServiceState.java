package org.telegram.messenger.voip;

import org.telegram.tgnet.TLRPC$PhoneCall;
import org.telegram.tgnet.TLRPC$User;

public interface VoIPServiceState {

    public abstract class CC {
        public static long $default$getCallDuration(VoIPServiceState voIPServiceState) {
            return 0L;
        }
    }

    void acceptIncomingCall();

    void declineIncomingCall();

    long getCallDuration();

    int getCallState();

    TLRPC$PhoneCall getPrivateCall();

    TLRPC$User getUser();

    boolean isOutgoing();

    void stopRinging();
}
