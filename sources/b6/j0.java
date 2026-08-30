package b6;

import android.content.ComponentName;
import android.os.Handler;
import android.os.Message;
import android.util.Log;
public final class j0 implements Handler.Callback {
    public final k0 f1610a;

    public j0(k0 k0Var) {
        this.f1610a = k0Var;
    }

    @Override
    public final boolean handleMessage(Message message) {
        int i10 = message.what;
        if (i10 != 0) {
            if (i10 != 1) {
                return false;
            }
            synchronized (this.f1610a.f1619a) {
                try {
                    h0 h0Var = (h0) message.obj;
                    i0 i0Var = (i0) this.f1610a.f1619a.get(h0Var);
                    if (i0Var != null && i0Var.f1604b == 3) {
                        Log.e("GmsClientSupervisor", "Timeout waiting for ServiceConnection callback ".concat(String.valueOf(h0Var)), new Exception());
                        ComponentName componentName = i0Var.f1606f;
                        if (componentName == null) {
                            h0Var.getClass();
                            componentName = null;
                        }
                        if (componentName == null) {
                            String str = h0Var.f1601b;
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
        synchronized (this.f1610a.f1619a) {
            try {
                h0 h0Var2 = (h0) message.obj;
                i0 i0Var2 = (i0) this.f1610a.f1619a.get(h0Var2);
                if (i0Var2 != null && i0Var2.f1603a.isEmpty()) {
                    if (i0Var2.f1605c) {
                        i0Var2.h.f1621c.removeMessages(1, i0Var2.e);
                        k0 k0Var = i0Var2.h;
                        k0Var.d.b(k0Var.f1620b, i0Var2);
                        i0Var2.f1605c = false;
                        i0Var2.f1604b = 2;
                    }
                    this.f1610a.f1619a.remove(h0Var2);
                }
            } finally {
            }
        }
        return true;
    }
}
