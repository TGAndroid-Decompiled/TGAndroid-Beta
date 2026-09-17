package n6;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
public final class i0 implements Handler.Callback {
    public final j0 f16583a;

    public i0(j0 j0Var) {
        this.f16583a = j0Var;
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            synchronized (this.f16583a.f16593a) {
                try {
                    g0 g0Var = (g0) message.obj;
                    h0 h0Var = (h0) this.f16583a.f16593a.get(g0Var);
                    if (h0Var != null && h0Var.f16576b == 3) {
                        Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(g0Var)), new Exception());
                        ComponentName componentName = h0Var.f16579f;
                        if (componentName == null) {
                            g0Var.getClass();
                            componentName = null;
                        }
                        if (componentName == null) {
                            String str = g0Var.f16573b;
                            l.h(str);
                            componentName = new ComponentName(str, "unknown");
                        }
                        h0Var.onServiceDisconnected(componentName);
                    }
                } finally {
                }
            }
            return true;
        }
        synchronized (this.f16583a.f16593a) {
            try {
                g0 g0Var2 = (g0) message.obj;
                h0 h0Var2 = (h0) this.f16583a.f16593a.get(g0Var2);
                if (h0Var2 != null && h0Var2.f16575a.isEmpty()) {
                    if (h0Var2.f16577c) {
                        h0Var2.h.f16595c.removeMessages(1, h0Var2.f16578e);
                        j0 j0Var = h0Var2.h;
                        j0Var.d.b(j0Var.f16594b, h0Var2);
                        h0Var2.f16577c = false;
                        h0Var2.f16576b = 2;
                    }
                    this.f16583a.f16593a.remove(g0Var2);
                }
            } finally {
            }
        }
        return true;
    }
}
