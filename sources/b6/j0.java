package b6;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
public final class j0 implements Handler.Callback {
    public final k0 f1621a;

    public j0(k0 k0Var) {
        this.f1621a = k0Var;
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            synchronized (this.f1621a.f1630a) {
                try {
                    h0 h0Var = (h0) message.obj;
                    i0 i0Var = (i0) this.f1621a.f1630a.get(h0Var);
                    if (i0Var != null && i0Var.f1615b == 3) {
                        Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(h0Var)), new Exception());
                        ComponentName componentName = i0Var.f1617f;
                        if (componentName == null) {
                            h0Var.getClass();
                            componentName = null;
                        }
                        if (componentName == null) {
                            String str = h0Var.f1612b;
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
        synchronized (this.f1621a.f1630a) {
            try {
                h0 h0Var2 = (h0) message.obj;
                i0 i0Var2 = (i0) this.f1621a.f1630a.get(h0Var2);
                if (i0Var2 != null && i0Var2.f1614a.isEmpty()) {
                    if (i0Var2.f1616c) {
                        i0Var2.h.f1632c.removeMessages(1, i0Var2.e);
                        k0 k0Var = i0Var2.h;
                        k0Var.d.b(k0Var.f1631b, i0Var2);
                        i0Var2.f1616c = false;
                        i0Var2.f1615b = 2;
                    }
                    this.f1621a.f1630a.remove(h0Var2);
                }
            } finally {
            }
        }
        return true;
    }
}
