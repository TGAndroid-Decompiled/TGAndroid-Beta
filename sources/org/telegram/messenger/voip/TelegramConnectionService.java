package org.telegram.messenger.voip;

import android.os.Bundle;
import android.telecom.Connection;
import android.telecom.ConnectionRequest;
import android.telecom.ConnectionService;
import android.telecom.PhoneAccountHandle;
import org.telegram.messenger.f8;
import org.telegram.messenger.v2;
public class TelegramConnectionService extends ConnectionService {
    @Override
    public void onCreate() {
        super.onCreate();
        if (v2.f18578a) {
            f8.l("ConnectionService created");
        }
    }

    @Override
    public Connection onCreateIncomingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        if (v2.f18578a) {
            f8.b("onCreateIncomingConnection ");
        }
        Bundle extras = connectionRequest.getExtras();
        if (extras.getInt("call_type") == 1) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance == null || sharedInstance.isOutgoing()) {
                return null;
            }
            return sharedInstance.getConnectionAndStartCall();
        }
        extras.getInt("call_type");
        return null;
    }

    @Override
    public void onCreateIncomingConnectionFailed(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        if (v2.f18578a) {
            f8.d("onCreateIncomingConnectionFailed ");
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().callFailedFromConnectionService();
        }
    }

    @Override
    public Connection onCreateOutgoingConnection(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        if (v2.f18578a) {
            f8.b("onCreateOutgoingConnection ");
        }
        Bundle extras = connectionRequest.getExtras();
        if (extras.getInt("call_type") == 1) {
            VoIPService sharedInstance = VoIPService.getSharedInstance();
            if (sharedInstance == null) {
                return null;
            }
            return sharedInstance.getConnectionAndStartCall();
        }
        extras.getInt("call_type");
        return null;
    }

    @Override
    public void onCreateOutgoingConnectionFailed(PhoneAccountHandle phoneAccountHandle, ConnectionRequest connectionRequest) {
        if (v2.f18578a) {
            f8.d("onCreateOutgoingConnectionFailed ");
        }
        if (VoIPService.getSharedInstance() != null) {
            VoIPService.getSharedInstance().callFailedFromConnectionService();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
        if (v2.f18578a) {
            f8.l("ConnectionService destroyed");
        }
    }
}
