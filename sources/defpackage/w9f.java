package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
public final class w9f implements Handler.Callback {
    public final byte a;
    public final Object b;

    public w9f(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    private final boolean a(Message message) {
        int i = message.arg1;
        if (Log.isLoggable("MessengerIpcClient", 3)) {
            StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 30);
            sb.append("Received response to request: ");
            sb.append(i);
            Log.d("MessengerIpcClient", sb.toString());
        }
        ccf ccfVar = (ccf) this.b;
        synchronized (ccfVar) {
            SparseArray sparseArray = ccfVar.e;
            uff uffVar = (uff) sparseArray.get(i);
            if (uffVar == 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 39);
                sb2.append("Received response for unknown request: ");
                sb2.append(i);
                Log.w("MessengerIpcClient", sb2.toString());
                return true;
            }
            sparseArray.remove(i);
            ccfVar.d();
            Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                uffVar.c(new Exception("Not supported by GmsCore", null));
                return true;
            }
            switch (uffVar.e) {
                case 0:
                    if (data.getBoolean("ack", false)) {
                        uffVar.b(null);
                        return true;
                    }
                    uffVar.c(new Exception("Invalid response to one way request", null));
                    return true;
                default:
                    Bundle bundle = data.getBundle("data");
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    uffVar.b(bundle);
                    return true;
            }
        }
    }

    @Override
    public final boolean handleMessage(Message message) {
        switch (this.a) {
            case 0:
                return a(message);
            default:
                int i = message.what;
                if (i != 0) {
                    if (i != 1) {
                        return false;
                    }
                    aef aefVar = (aef) this.b;
                    synchronized (aefVar.a) {
                        o7f o7fVar = (o7f) message.obj;
                        y9f y9fVar = (y9f) aefVar.a.get(o7fVar);
                        if (y9fVar != null && y9fVar.b == 3) {
                            String valueOf = String.valueOf(o7fVar);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                            sb.append("Timeout waiting for ServiceConnection callback ");
                            sb.append(valueOf);
                            Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                            ComponentName componentName = y9fVar.f;
                            if (componentName == null) {
                                o7fVar.getClass();
                                componentName = null;
                            }
                            if (componentName == null) {
                                String str = o7fVar.b;
                                xve.h(str);
                                componentName = new ComponentName(str, "unknown");
                            }
                            y9fVar.onServiceDisconnected(componentName);
                        }
                    }
                } else {
                    aef aefVar2 = (aef) this.b;
                    synchronized (aefVar2.a) {
                        o7f o7fVar2 = (o7f) message.obj;
                        y9f y9fVar2 = (y9f) aefVar2.a.get(o7fVar2);
                        if (y9fVar2 != null && y9fVar2.a.isEmpty()) {
                            if (y9fVar2.c) {
                                o7f o7fVar3 = y9fVar2.e;
                                aef aefVar3 = y9fVar2.h;
                                aefVar3.c.removeMessages(1, o7fVar3);
                                aefVar3.d.K(aefVar3.b, y9fVar2);
                                y9fVar2.c = false;
                                y9fVar2.b = (byte) 2;
                            }
                            aefVar2.a.remove(o7fVar2);
                        }
                    }
                }
                return true;
        }
    }
}
