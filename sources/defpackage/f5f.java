package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
public final class f5f implements Handler.Callback {
    public final byte a;
    public final Object b;

    public f5f(Object obj, byte b) {
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
        l7f l7fVar = (l7f) this.b;
        synchronized (l7fVar) {
            SparseArray sparseArray = l7fVar.e;
            ebf ebfVar = (ebf) sparseArray.get(i);
            if (ebfVar == 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 39);
                sb2.append("Received response for unknown request: ");
                sb2.append(i);
                Log.w("MessengerIpcClient", sb2.toString());
                return true;
            }
            sparseArray.remove(i);
            l7fVar.d();
            Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                ebfVar.c(new Exception("Not supported by GmsCore", null));
                return true;
            }
            switch (ebfVar.e) {
                case 0:
                    if (data.getBoolean("ack", false)) {
                        ebfVar.b(null);
                        return true;
                    }
                    ebfVar.c(new Exception("Invalid response to one way request", null));
                    return true;
                default:
                    Bundle bundle = data.getBundle("data");
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    ebfVar.b(bundle);
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
                    j9f j9fVar = (j9f) this.b;
                    synchronized (j9fVar.a) {
                        x2f x2fVar = (x2f) message.obj;
                        h5f h5fVar = (h5f) j9fVar.a.get(x2fVar);
                        if (h5fVar != null && h5fVar.b == 3) {
                            String valueOf = String.valueOf(x2fVar);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                            sb.append("Timeout waiting for ServiceConnection callback ");
                            sb.append(valueOf);
                            Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                            ComponentName componentName = h5fVar.f;
                            if (componentName == null) {
                                x2fVar.getClass();
                                componentName = null;
                            }
                            if (componentName == null) {
                                String str = x2fVar.b;
                                fre.h(str);
                                componentName = new ComponentName(str, "unknown");
                            }
                            h5fVar.onServiceDisconnected(componentName);
                        }
                    }
                } else {
                    j9f j9fVar2 = (j9f) this.b;
                    synchronized (j9fVar2.a) {
                        x2f x2fVar2 = (x2f) message.obj;
                        h5f h5fVar2 = (h5f) j9fVar2.a.get(x2fVar2);
                        if (h5fVar2 != null && h5fVar2.a.isEmpty()) {
                            if (h5fVar2.c) {
                                x2f x2fVar3 = h5fVar2.e;
                                j9f j9fVar3 = h5fVar2.h;
                                j9fVar3.c.removeMessages(1, x2fVar3);
                                j9fVar3.d.M(j9fVar3.b, h5fVar2);
                                h5fVar2.c = false;
                                h5fVar2.b = (byte) 2;
                            }
                            j9fVar2.a.remove(x2fVar2);
                        }
                    }
                }
                return true;
        }
    }
}
