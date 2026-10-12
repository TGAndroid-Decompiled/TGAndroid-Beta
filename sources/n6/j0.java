package n6;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
public final class j0 implements Handler.Callback {
    public final k0 f16113a;

    public j0(k0 k0Var) {
        this.f16113a = k0Var;
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            synchronized (this.f16113a.f16116a) {
                try {
                    h0 h0Var = (h0) message.obj;
                    i0 i0Var = (i0) this.f16113a.f16116a.get(h0Var);
                    if (i0Var != null && i0Var.f16104b == 3) {
                        Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(h0Var)), new Exception());
                        ComponentName componentName = i0Var.f16106f;
                        if (componentName == null) {
                            h0Var.getClass();
                            componentName = null;
                        }
                        if (componentName == null) {
                            String str = h0Var.f16098b;
                            l.h(str);
                            componentName = new ComponentName(str, "unknown");
                        }
                        i0Var.onServiceDisconnected(componentName);
                    }
                } finally {
                }
            }
            return true;
        }
        synchronized (this.f16113a.f16116a) {
            try {
                h0 h0Var2 = (h0) message.obj;
                i0 i0Var2 = (i0) this.f16113a.f16116a.get(h0Var2);
                if (i0Var2 != null && i0Var2.f16103a.isEmpty()) {
                    if (i0Var2.f16105c) {
                        i0Var2.h.f16118c.removeMessages(1, i0Var2.e);
                        k0 k0Var = i0Var2.h;
                        k0Var.d.b(k0Var.f16117b, i0Var2);
                        i0Var2.f16105c = false;
                        i0Var2.f16104b = 2;
                    }
                    this.f16113a.f16116a.remove(h0Var2);
                }
            } finally {
            }
        }
        return true;
    }
}
