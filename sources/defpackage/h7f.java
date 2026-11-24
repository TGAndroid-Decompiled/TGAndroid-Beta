package defpackage;

import android.content.ComponentName;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
import android.util.SparseArray;
public final class h7f implements Handler.Callback {
    public final byte a;
    public final Object b;

    public h7f(Object obj, byte b) {
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
        n9f n9fVar = (n9f) this.b;
        synchronized (n9fVar) {
            SparseArray sparseArray = n9fVar.e;
            fdf fdfVar = (fdf) sparseArray.get(i);
            if (fdfVar == 0) {
                StringBuilder sb2 = new StringBuilder(String.valueOf(i).length() + 39);
                sb2.append("Received response for unknown request: ");
                sb2.append(i);
                Log.w("MessengerIpcClient", sb2.toString());
                return true;
            }
            sparseArray.remove(i);
            n9fVar.d();
            Bundle data = message.getData();
            if (data.getBoolean("unsupported", false)) {
                fdfVar.c(new Exception("Not supported by GmsCore", null));
                return true;
            }
            switch (fdfVar.e) {
                case 0:
                    if (data.getBoolean("ack", false)) {
                        fdfVar.b(null);
                        return true;
                    }
                    fdfVar.c(new Exception("Invalid response to one way request", null));
                    return true;
                default:
                    Bundle bundle = data.getBundle("data");
                    if (bundle == null) {
                        bundle = Bundle.EMPTY;
                    }
                    fdfVar.b(bundle);
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
                    lbf lbfVar = (lbf) this.b;
                    synchronized (lbfVar.a) {
                        z4f z4fVar = (z4f) message.obj;
                        j7f j7fVar = (j7f) lbfVar.a.get(z4fVar);
                        if (j7fVar != null && j7fVar.b == 3) {
                            String valueOf = String.valueOf(z4fVar);
                            StringBuilder sb = new StringBuilder(valueOf.length() + 47);
                            sb.append("Timeout waiting for ServiceConnection callback ");
                            sb.append(valueOf);
                            Log.e("GmsClientSupervisor", sb.toString(), new Exception());
                            ComponentName componentName = j7fVar.f;
                            if (componentName == null) {
                                z4fVar.getClass();
                                componentName = null;
                            }
                            if (componentName == null) {
                                String str = z4fVar.b;
                                ite.h(str);
                                componentName = new ComponentName(str, "unknown");
                            }
                            j7fVar.onServiceDisconnected(componentName);
                        }
                    }
                } else {
                    lbf lbfVar2 = (lbf) this.b;
                    synchronized (lbfVar2.a) {
                        z4f z4fVar2 = (z4f) message.obj;
                        j7f j7fVar2 = (j7f) lbfVar2.a.get(z4fVar2);
                        if (j7fVar2 != null && j7fVar2.a.isEmpty()) {
                            if (j7fVar2.c) {
                                z4f z4fVar3 = j7fVar2.e;
                                lbf lbfVar3 = j7fVar2.h;
                                lbfVar3.c.removeMessages(1, z4fVar3);
                                lbfVar3.d.K(lbfVar3.b, j7fVar2);
                                j7fVar2.c = false;
                                j7fVar2.b = (byte) 2;
                            }
                            lbfVar2.a.remove(z4fVar2);
                        }
                    }
                }
                return true;
        }
    }
}
