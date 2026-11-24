package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class s9c implements g59, i59 {
    public final t9c a;

    public s9c(t9c t9cVar) {
        this.a = t9cVar;
    }

    @Override
    public final void d(float f, float f2, int i, View view) {
        long j;
        float f3;
        n9c n9cVar;
        t9c t9cVar = this.a;
        ds0 ds0Var = t9cVar.Y1;
        gi7 gi7Var = t9cVar.U1;
        HashSet hashSet = t9cVar.b2;
        if (view instanceof xib) {
            v55 v55Var = t9cVar.r2;
            if (v55Var != null) {
                v55Var.run();
                t9cVar.dismiss();
            }
        } else if (view instanceof m1a) {
            m1a m1aVar = (m1a) view;
            TLRPC.User user = m1aVar.getUser();
            TLRPC.Chat chat = m1aVar.getChat();
            if (user == null) {
                if (chat != null) {
                    j = -chat.id;
                } else {
                    return;
                }
            } else {
                j = user.id;
            }
            boolean z = false;
            if (hashSet.isEmpty()) {
                hashSet.add(Long.valueOf(j));
                jac jacVar = t9cVar.t2;
                if (jacVar != null) {
                    jh2 jh2Var = t9cVar.X1;
                    if (jh2Var != null && jh2Var.a.q) {
                        z = true;
                    }
                    jacVar.a(Boolean.valueOf(z), hashSet);
                    t9cVar.t2 = null;
                }
                t9cVar.dismiss();
                return;
            }
            boolean z2 = !hashSet.isEmpty();
            if (hashSet.contains(Long.valueOf(j))) {
                hashSet.remove(Long.valueOf(j));
            } else {
                hashSet.add(Long.valueOf(j));
                t9cVar.h2.put(Long.valueOf(j), user);
            }
            if (hashSet.size() == t9cVar.b1() + 1) {
                hashSet.remove(Long.valueOf(j));
                t9cVar.d1();
                return;
            }
            boolean isEmpty = hashSet.isEmpty();
            boolean z3 = !isEmpty;
            if (z2 != z3) {
                ds0Var.setVisibility(0);
                ViewPropertyAnimator animate = ds0Var.animate();
                float f4 = 0.0f;
                if (!isEmpty) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f3);
                if (isEmpty) {
                    f4 = gm.L(12.0f);
                }
                ViewPropertyAnimator duration = alpha.translationY(f4).setInterpolator(d53.h).setDuration(320L);
                if (isEmpty) {
                    n9cVar = new n9c(t9cVar, (byte) 1);
                } else {
                    n9cVar = null;
                }
                duration.withEndAction(n9cVar).start();
                v0a v0aVar = t9cVar.j2;
                boolean z4 = !z3;
                if (v0aVar.E != z4) {
                    v0aVar.E = z4;
                    gm.d0(v0aVar.f, new t0a(z4));
                }
            }
            t9cVar.Y0();
            gi7Var.b(true, hashSet, new n9c(t9cVar, (byte) 2), null);
            t9cVar.g1(true, true);
            t9cVar.Z0();
        }
    }

    @Override
    public final boolean u(View view) {
        return false;
    }

    public s9c(t9c t9cVar, q63 q63Var, int i) {
        this.a = t9cVar;
    }

    @Override
    public final void i() {
    }

    @Override
    public final void k(float f) {
    }

    @Override
    public final void p(View view, float f, float f2) {
    }

    @Override
    public final boolean mo14d(float f, float f2, int i, View view) {
        t9c t9cVar = this.a;
        ds0 ds0Var = t9cVar.Y1;
        HashSet hashSet = t9cVar.b2;
        if (view instanceof m1a) {
            m1a m1aVar = (m1a) view;
            TLRPC.User user = m1aVar.getUser();
            long j = user != null ? user.id : -m1aVar.getChat().id;
            boolean z = !hashSet.isEmpty();
            if (hashSet.contains(Long.valueOf(j))) {
                hashSet.remove(Long.valueOf(j));
            } else {
                hashSet.add(Long.valueOf(j));
                t9cVar.h2.put(Long.valueOf(j), user);
            }
            if (hashSet.size() == t9cVar.b1() + 1) {
                hashSet.remove(Long.valueOf(j));
                t9cVar.d1();
                return true;
            }
            boolean isEmpty = hashSet.isEmpty();
            boolean z2 = !isEmpty;
            if (z != z2) {
                ds0Var.setVisibility(0);
                ds0Var.animate().alpha(!isEmpty ? 1.0f : 0.0f).translationY(isEmpty ? gm.L(12.0f) : 0.0f).setInterpolator(d53.h).setDuration(320L).withEndAction(isEmpty ? new n9c(t9cVar, (byte) 7) : null).start();
                v0a v0aVar = t9cVar.j2;
                boolean z3 = !z2;
                if (v0aVar.E != z3) {
                    v0aVar.E = z3;
                    gm.d0(v0aVar.f, new t0a(z3));
                }
            }
            t9cVar.Y0();
            t9cVar.U1.b(true, hashSet, new n9c(t9cVar, (byte) 8), null);
            t9cVar.g1(true, true);
            t9cVar.Z0();
            return true;
        }
        return false;
    }
}
