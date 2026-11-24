package defpackage;

import android.view.View;
import android.view.ViewPropertyAnimator;
import java.util.HashSet;
import org.telegram.tgnet.TLRPC;
public final class r7c implements d39, f39 {
    public final s7c a;

    public r7c(s7c s7cVar) {
        this.a = s7cVar;
    }

    @Override
    public final void e(float f, float f2, int i, View view) {
        long j;
        float f3;
        m7c m7cVar;
        s7c s7cVar = this.a;
        dr0 dr0Var = s7cVar.Y1;
        dg7 dg7Var = s7cVar.U1;
        HashSet hashSet = s7cVar.b2;
        if (view instanceof wgb) {
            w35 w35Var = s7cVar.r2;
            if (w35Var != null) {
                w35Var.run();
                s7cVar.dismiss();
            }
        } else if (view instanceof kz9) {
            kz9 kz9Var = (kz9) view;
            TLRPC.User user = kz9Var.getUser();
            TLRPC.Chat chat = kz9Var.getChat();
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
                i8c i8cVar = s7cVar.t2;
                if (i8cVar != null) {
                    wf2 wf2Var = s7cVar.X1;
                    if (wf2Var != null && wf2Var.a.q) {
                        z = true;
                    }
                    i8cVar.a(Boolean.valueOf(z), hashSet);
                    s7cVar.t2 = null;
                }
                s7cVar.dismiss();
                return;
            }
            boolean z2 = !hashSet.isEmpty();
            if (hashSet.contains(Long.valueOf(j))) {
                hashSet.remove(Long.valueOf(j));
            } else {
                hashSet.add(Long.valueOf(j));
                s7cVar.h2.put(Long.valueOf(j), user);
            }
            if (hashSet.size() == s7cVar.b1() + 1) {
                hashSet.remove(Long.valueOf(j));
                s7cVar.d1();
                return;
            }
            boolean isEmpty = hashSet.isEmpty();
            boolean z3 = !isEmpty;
            if (z2 != z3) {
                dr0Var.setVisibility(0);
                ViewPropertyAnimator animate = dr0Var.animate();
                float f4 = 0.0f;
                if (!isEmpty) {
                    f3 = 1.0f;
                } else {
                    f3 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f3);
                if (isEmpty) {
                    f4 = gl.L(12.0f);
                }
                ViewPropertyAnimator duration = alpha.translationY(f4).setInterpolator(s33.h).setDuration(320L);
                if (isEmpty) {
                    m7cVar = new m7c(s7cVar, (byte) 1);
                } else {
                    m7cVar = null;
                }
                duration.withEndAction(m7cVar).start();
                ty9 ty9Var = s7cVar.j2;
                boolean z4 = !z3;
                if (ty9Var.E != z4) {
                    ty9Var.E = z4;
                    gl.d0(ty9Var.f, new ry9(z4));
                }
            }
            s7cVar.Y0();
            dg7Var.b(true, hashSet, new m7c(s7cVar, (byte) 2), null);
            s7cVar.g1(true, true);
            s7cVar.Z0();
        }
    }

    @Override
    public final boolean q(View view) {
        return false;
    }

    public r7c(s7c s7cVar, e53 e53Var, int i) {
        this.a = s7cVar;
    }

    @Override
    public final void f() {
    }

    @Override
    public final void g(float f) {
    }

    @Override
    public final void l(View view, float f, float f2) {
    }

    @Override
    public final boolean mo8e(float f, float f2, int i, View view) {
        s7c s7cVar = this.a;
        dr0 dr0Var = s7cVar.Y1;
        HashSet hashSet = s7cVar.b2;
        if (view instanceof kz9) {
            kz9 kz9Var = (kz9) view;
            TLRPC.User user = kz9Var.getUser();
            long j = user != null ? user.id : -kz9Var.getChat().id;
            boolean z = !hashSet.isEmpty();
            if (hashSet.contains(Long.valueOf(j))) {
                hashSet.remove(Long.valueOf(j));
            } else {
                hashSet.add(Long.valueOf(j));
                s7cVar.h2.put(Long.valueOf(j), user);
            }
            if (hashSet.size() == s7cVar.b1() + 1) {
                hashSet.remove(Long.valueOf(j));
                s7cVar.d1();
                return true;
            }
            boolean isEmpty = hashSet.isEmpty();
            boolean z2 = !isEmpty;
            if (z != z2) {
                dr0Var.setVisibility(0);
                dr0Var.animate().alpha(!isEmpty ? 1.0f : 0.0f).translationY(isEmpty ? gl.L(12.0f) : 0.0f).setInterpolator(s33.h).setDuration(320L).withEndAction(isEmpty ? new m7c(s7cVar, (byte) 7) : null).start();
                ty9 ty9Var = s7cVar.j2;
                boolean z3 = !z2;
                if (ty9Var.E != z3) {
                    ty9Var.E = z3;
                    gl.d0(ty9Var.f, new ry9(z3));
                }
            }
            s7cVar.Y0();
            s7cVar.U1.b(true, hashSet, new m7c(s7cVar, (byte) 8), null);
            s7cVar.g1(true, true);
            s7cVar.Z0();
            return true;
        }
        return false;
    }
}
