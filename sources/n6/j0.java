package n6;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
public final class j0 implements Handler.Callback {
    public final k0 f16431a;

    public j0(k0 k0Var) {
        this.f16431a = k0Var;
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            synchronized (this.f16431a.f16437a) {
                try {
                    h0 h0Var = (h0) message.obj;
                    i0 i0Var = (i0) this.f16431a.f16437a.get(h0Var);
                    if (i0Var != null && i0Var.f16420b == 3) {
                        Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(h0Var)), new Exception());
                        ComponentName componentName = i0Var.f16423f;
                        if (componentName == null) {
                            h0Var.getClass();
                            componentName = null;
                        }
                        if (componentName == null) {
                            String str = h0Var.f16414b;
                            m.h(str);
                            componentName = new ComponentName(str, "unknown");
                        }
                        i0Var.onServiceDisconnected(componentName);
                    }
                } finally {
                }
            }
            return true;
        }
        synchronized (this.f16431a.f16437a) {
            try {
                h0 h0Var2 = (h0) message.obj;
                i0 i0Var2 = (i0) this.f16431a.f16437a.get(h0Var2);
                if (i0Var2 != null && i0Var2.f16419a.isEmpty()) {
                    if (i0Var2.f16421c) {
                        i0Var2.h.f16439c.removeMessages(1, i0Var2.f16422e);
                        k0 k0Var = i0Var2.h;
                        k0Var.d.b(k0Var.f16438b, i0Var2);
                        i0Var2.f16421c = false;
                        i0Var2.f16420b = 2;
                    }
                    this.f16431a.f16437a.remove(h0Var2);
                }
            } finally {
            }
        }
        return true;
    }
}
