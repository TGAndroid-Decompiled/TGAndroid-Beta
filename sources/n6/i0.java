package n6;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
public final class i0 implements Handler.Callback {
    public final j0 f15273a;

    public i0(j0 j0Var) {
        this.f15273a = j0Var;
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            synchronized (this.f15273a.f15282a) {
                try {
                    g0 g0Var = (g0) message.obj;
                    h0 h0Var = (h0) this.f15273a.f15282a.get(g0Var);
                    if (h0Var != null && h0Var.f15267b == 3) {
                        Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(g0Var)), new Exception());
                        ComponentName componentName = h0Var.f15269f;
                        if (componentName == null) {
                            g0Var.getClass();
                            componentName = null;
                        }
                        if (componentName == null) {
                            String str = g0Var.f15264b;
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
        synchronized (this.f15273a.f15282a) {
            try {
                g0 g0Var2 = (g0) message.obj;
                h0 h0Var2 = (h0) this.f15273a.f15282a.get(g0Var2);
                if (h0Var2 != null && h0Var2.f15266a.isEmpty()) {
                    if (h0Var2.f15268c) {
                        h0Var2.h.f15284c.removeMessages(1, h0Var2.e);
                        j0 j0Var = h0Var2.h;
                        j0Var.d.b(j0Var.f15283b, h0Var2);
                        h0Var2.f15268c = false;
                        h0Var2.f15267b = 2;
                    }
                    this.f15273a.f15282a.remove(g0Var2);
                }
            } finally {
            }
        }
        return true;
    }
}
