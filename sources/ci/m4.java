package ci;

import android.os.Bundle;
import android.os.RemoteException;
import android.os.SystemClock;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.ui.Components.w51;
import org.telegram.ui.s60;
public final class m4 implements e2.h {
    public final int f5039a;
    public final int f5040b;
    public final Object f5041c;

    public m4(Object obj, int i10, int i11) {
        this.f5039a = i11;
        this.f5041c = obj;
        this.f5040b = i10;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        m4.l lVar;
        m4.l lVar2;
        int i10 = this.f5039a;
        int i11 = this.f5040b;
        Object obj2 = this.f5041c;
        switch (i10) {
            case 0:
                u4 u4Var = (u4) obj2;
                View view = (View) obj;
                p4 p4Var = u4Var.f5612b;
                if (view instanceof t4) {
                    p4Var.getClass();
                    int S = RecyclerView.S(view);
                    w51 G = p4Var.Y2.G(S);
                    if (G != null) {
                        t4 t4Var = (t4) view;
                        t4Var.setPosition(u4Var.b(S));
                        if (i11 == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        t4Var.b(z10, true);
                        view.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                m4.r rVar = (m4.r) obj2;
                try {
                    try {
                        lVar2 = (m4.l) ((i9.w) obj).get();
                        e2.d.e(lVar2, "LibraryResult must not be null");
                    } catch (InterruptedException e) {
                        e = e;
                        e2.a.o("MediaSessionStub", "Library operation failed", e);
                        String str = m4.l.d;
                        m4.n1 n1Var = new m4.n1("no error message provided", -1, Bundle.EMPTY);
                        lVar = new m4.l(n1Var.f14846a, SystemClock.elapsedRealtime(), n1Var);
                        lVar2 = lVar;
                        m4.q qVar = rVar.d;
                        e2.d.h(qVar);
                        qVar.a(i11, lVar2);
                        return;
                    } catch (CancellationException e7) {
                        e2.a.o("MediaSessionStub", "Library operation cancelled", e7);
                        String str2 = m4.l.d;
                        m4.n1 n1Var2 = new m4.n1("no error message provided", 1, Bundle.EMPTY);
                        lVar = new m4.l(n1Var2.f14846a, SystemClock.elapsedRealtime(), n1Var2);
                        lVar2 = lVar;
                        m4.q qVar2 = rVar.d;
                        e2.d.h(qVar2);
                        qVar2.a(i11, lVar2);
                        return;
                    } catch (ExecutionException e10) {
                        e = e10;
                        e2.a.o("MediaSessionStub", "Library operation failed", e);
                        String str3 = m4.l.d;
                        m4.n1 n1Var3 = new m4.n1("no error message provided", -1, Bundle.EMPTY);
                        lVar = new m4.l(n1Var3.f14846a, SystemClock.elapsedRealtime(), n1Var3);
                        lVar2 = lVar;
                        m4.q qVar22 = rVar.d;
                        e2.d.h(qVar22);
                        qVar22.a(i11, lVar2);
                        return;
                    }
                    m4.q qVar222 = rVar.d;
                    e2.d.h(qVar222);
                    qVar222.a(i11, lVar2);
                    return;
                } catch (RemoteException e11) {
                    e2.a.o("MediaSessionStub", "Failed to send result to browser " + rVar, e11);
                    return;
                }
            default:
                s60.e1((s60) obj2, i11, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
