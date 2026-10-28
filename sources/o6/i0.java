package o6;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
public final class i0 implements Handler.Callback {
    public final j0 f19142a;

    public i0(j0 j0Var) {
        this.f19142a = j0Var;
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            synchronized (this.f19142a.f19151a) {
                try {
                    g0 g0Var = (g0) message.obj;
                    h0 h0Var = (h0) this.f19142a.f19151a.get(g0Var);
                    if (h0Var != null && h0Var.f19136b == 3) {
                        Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(g0Var)), new Exception());
                        ComponentName componentName = h0Var.f19138f;
                        if (componentName == null) {
                            g0Var.getClass();
                            componentName = null;
                        }
                        if (componentName == null) {
                            String str = g0Var.f19133b;
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
        synchronized (this.f19142a.f19151a) {
            try {
                g0 g0Var2 = (g0) message.obj;
                h0 h0Var2 = (h0) this.f19142a.f19151a.get(g0Var2);
                if (h0Var2 != null && h0Var2.f19135a.isEmpty()) {
                    if (h0Var2.f19137c) {
                        h0Var2.h.f19153c.removeMessages(1, h0Var2.e);
                        j0 j0Var = h0Var2.h;
                        j0Var.d.b(j0Var.f19152b, h0Var2);
                        h0Var2.f19137c = false;
                        h0Var2.f19136b = 2;
                    }
                    this.f19142a.f19151a.remove(g0Var2);
                }
            } finally {
            }
        }
        return true;
    }
}
