package n6;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
public final class i0 implements Handler.Callback {
    public final j0 f13880a;

    public i0(j0 j0Var) {
        this.f13880a = j0Var;
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            synchronized (this.f13880a.f13889a) {
                try {
                    g0 g0Var = (g0) message.obj;
                    h0 h0Var = (h0) this.f13880a.f13889a.get(g0Var);
                    if (h0Var != null && h0Var.f13874b == 3) {
                        Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(g0Var)), new Exception());
                        ComponentName componentName = h0Var.f13876f;
                        if (componentName == null) {
                            g0Var.getClass();
                            componentName = null;
                        }
                        if (componentName == null) {
                            String str = g0Var.f13871b;
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
        synchronized (this.f13880a.f13889a) {
            try {
                g0 g0Var2 = (g0) message.obj;
                h0 h0Var2 = (h0) this.f13880a.f13889a.get(g0Var2);
                if (h0Var2 != null && h0Var2.f13873a.isEmpty()) {
                    if (h0Var2.f13875c) {
                        h0Var2.h.f13891c.removeMessages(1, h0Var2.e);
                        j0 j0Var = h0Var2.h;
                        j0Var.d.b(j0Var.f13890b, h0Var2);
                        h0Var2.f13875c = false;
                        h0Var2.f13874b = 2;
                    }
                    this.f13880a.f13889a.remove(g0Var2);
                }
            } finally {
            }
        }
        return true;
    }
}
